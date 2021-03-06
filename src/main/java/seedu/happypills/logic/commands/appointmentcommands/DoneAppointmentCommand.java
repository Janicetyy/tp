package seedu.happypills.logic.commands.appointmentcommands;

import seedu.happypills.HappyPills;
import seedu.happypills.model.data.Appointment;
import seedu.happypills.model.data.AppointmentMap;
import seedu.happypills.model.data.PatientMap;
import seedu.happypills.model.data.PatientRecordMap;
import seedu.happypills.model.data.Patient;
import seedu.happypills.model.exception.HappyPillsException;
import seedu.happypills.storage.Storage;
import seedu.happypills.ui.AppointmentTextUi;
import seedu.happypills.ui.StorageTextUi;

import java.io.IOException;
import java.util.logging.Logger;

public class DoneAppointmentCommand extends AppointmentCommand {
    protected String nric;
    protected String apptID;

    Logger logger = Logger.getLogger(HappyPills.class.getName());

    /**
     * Constructor for DoneAppointmentCommand Class.
     * It creates a new DoneAppointmentCommand Object with the information provided.
     *
     * @param nric Contains the nric of the patient that is to be retrieved.
     * @param apptID Contains the id of the appointment to be marked as done
     */
    public DoneAppointmentCommand(String nric, String apptID) {
        this.nric = nric;
        this.apptID = apptID;
    }

    /**
     * Retrieve the patient from the NRIC of the Done command.
     *
     * @param patients Contains the list of patients to be searched.
     */
    private Patient findPatient(PatientMap patients) {
        if (patients.containsKey(nric)) {
            return patients.get(nric);
        } else {
            return null;
        }
    }

    /**
     * Retrieve the appointment from the patient provided.
     *
     * @param appointments Contains the appointment map to get appointment from.
     * @return the appointment with the specified apptID or null if not found
     */
    private Appointment findAppointment(AppointmentMap appointments) {
        if (appointments.containsKey(apptID)) {
            return appointments.get(apptID);
        }
        return null;
    }

    /**
     * Mark appointment in the list within the patient object as done.
     *
     * @param patient Contains the patient that to get appointment from.
     *
     * @return the appointment with the specified apptID or null if not found
     */
    private Boolean editDone(Patient patient) {
        for (Appointment appointment : patient.getAppointments()) {
            if (appointment.getAppointmentId().equals(apptID)) {
                appointment.setDone(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Mark appointment in the shared appointment map as done.
     *
     * @param appointment The appointment which is to be marked done.
     *
     * @return true if successful, false otherwise.
     */
    private Boolean editDone(Appointment appointment) {
        appointment.setDone(true);
        return true;
    }

    /**
     * Edit the appointment details with the information provided by calling.
     *
     * @param patients Contains the list of patients on which the commands are executed on.
     * @param appointments Contains the list of appointments on which the commands are executed on.
     * @throws HappyPillsException Throws an exception if the edit field is not valid.
     */
    @Override
    public String execute(
            PatientMap patients, AppointmentMap appointments, PatientRecordMap visits
    ) throws HappyPillsException {
        Patient editPatient = findPatient(patients);
        if (editPatient == null) {
            throw new HappyPillsException("    Patient not found. Please try again.");
        }
        Appointment editAppt = findAppointment(appointments); //from the shared appointment map
        if (editAppt == null) {
            throw new HappyPillsException("    Appointment not found. Please try again.");
        }
        Boolean output = editDone(editPatient) && editDone(editAppt);
        if (!output) {
            throw new HappyPillsException(" An unknown error has occurred, please try again later.");
        } else {
            try {
                Storage.writeAllToFile(Storage.APPOINTMENT_FILEPATH,
                        StorageTextUi.getFormattedApptString(appointments));
            } catch (IOException e) {
                logger.info(StorageTextUi.failToWriteAppointmentMsg);
            }
        }

        return AppointmentTextUi.doneAppointmentSuccessMessage(editAppt);
    }
}
