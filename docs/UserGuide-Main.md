# HappyPills
HappyPills is a note-taking application that allows doctors to keep track of patients' personal information, medical records and even appointments.
 All these done using Command Line Interface (CLI), which means the program is more compact than ever!
HappyPills replaces all physical pen and papers, since it is highly optimised for users who enjoy typing.
Regardless of your typing speed, HappyPills can manage your patients’ records faster than other traditional Graphical User Interface (GUI) applications. 
All your notes would be neatly organised and stored, so that all information of the patients are always safe and readily available. 

Say *HELLO* to clutter-free desks, efficient patient management and legible medical records with HappyPills!

## Table of Contents
* [Quick Start](#quick-start)
* [Features](#features)
* [Command Summary](#command-summary)
* [Usage](#usage)
    * [General](/docs/UserGuide-General.md)
    * [Patient](/docs/UserGuide-Patients.md)
    * [FAQ](#faq)
## Quick Start
**Installation**
1. Ensure that you have `Java 11` or later installed in your computer 
2. Click [here](https://github.com/AY1920S2-CS2113T-T12-2/tp/releases) to download the HappyPills JAR File

**For Window users**
1. Open Command Prompt in the directory where the JAR file is located.
2. Run the command `java -jar happypills.jar`

##Features

## Command Summary
Command | Description
---------------|---------------
`help [command]` | Display a help message with all commands or specific commands with usage examples
`list` | Display all the Patients in alphabetical order
<code>add /ic\[NRIC] /n\[NAME] <br>/p\[PHONE_NUMBER] /d\[DOB] <br>/b\[BLOOD_TYPE] <br>\[Optional:  /a\[ALLERGIES] <br>/r\[REMARKS]]</code> | Add a new patient with the specified details.
`get [nric]` | Retrieve details of the patient with the specified NRIC
<code>edit NRIC \[Options]\[editedInput];</code> <br> <code>Options: </Code> <br> <code> -p edit phone number</code><br> <code> -a edit allergies</code> <br> <code> -r edit remarks</code>| Edit information of the patient with the specified NRIC
`delete [nric]` | Deletes a patient with the specified NRIC
`exit` | Saves the data to a text file and exits the program

## FAQ



