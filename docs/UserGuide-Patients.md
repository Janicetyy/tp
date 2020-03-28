##Patients
This section will provide instruction for patients-related commands, such as adding a new patient, 
or making modification to details of a specific patient.

* [Command Summary](#command-summary)
* [List](#list)
* [Add](#add)
* [Get](#get)
* [Edit](#edit)
* [Delete](#delete)

[Return to main](/docs/UserGuide-Main.md)

##Command Summary
Command | Description
---------------|---------------
`list` | Display all the Patients in alphabetical order
<code>add /ic\[NRIC] /n\[NAME] <br>/p\[PHONE_NUMBER] /d\[DOB] <br>/b\[BLOOD_TYPE] <br>\[Optional:  /a\[ALLERGIES] <br>/r\[REMARKS]]</code> | Add a new patient with the specified details.
`get [nric]` | Retrieve details of the patient with the specified NRIC
<code>edit NRIC \[Options]\[editedInput];</code> <br> <code>Options: </Code> <br> <code> -p edit phone number</code><br> <code> -a edit allergies</code> <br> <code> -r edit remarks</code>| Edit information of the patient with the specified NRIC
`delete [nric]` | Deletes a patient with the specified NRIC

[Back to top](#patients)

### List
Display all the Patients in alphabetical order
##### Usage example:
```
list
```
> ***Expected output:***
>
>         ===================================================
>         Alice | S8888888A 
>         Bob   | S9999999Z   
>         ===================================================    

[Back to top](#patients)

### Add
Add a new patient with the specified parameters in any order.
Any missing field will be prompt.
User will require to confirm the input before add the new patient.

##### Usage example:
*To add a new user*   
```
add /ic[NRIC] /n[NAME] /p[PHONE_NUMBER] /d[DOB] /b[BLOOD_TYPE]
```
###### Example:
- `add /ic S9999999Z /n Bob /d 12-11-98 /b A+`
>***Expected output:***
>    
>       =====================================================
>       Please input your missing detail listed below
>       /p[PHONE] only number
>       =====================================================
>
- `/p 999` to add missing field.
> ***Expected output:***
>
>     =====================================================
>         Name : Bob
>         NRIC : S9999999Z
>         Phone Number : 999
>         DOB : 12-11-98
>         Blood Type : A+
>         Allergies : NIL
>         Remarks : NIL
>                                                    (Y/N)?
>     =====================================================
- Type `y` to confirm.
> ***Expected output:***
>    
>       =====================================================
>       Got it! I've added this patient:
>         Name : Bob
>         NRIC : S9999999Z
>         Phone Number : 999
>         DOB : 12-11-98
>         Blood Type : A+
>         Allergies : NIL
>         Remarks : NIL
>       =====================================================

[Back to top](#patients)

### Get
Retrieve details of the patient with the specified NRIC
##### Usage example:
`get [nric]`
###### Example:
- `get S9999999Z`
> ***Expected output:***
>
>        ===================================================
>         Here are the patient's details:
>             Name : Bob
>             NRIC : S9999999Z
>             Phone Number : 999
>             DOB : 12-11-98
>             Blood Type : A+
>             Allergies : School
>             Remarks : Had contact with COVID-19 Case200
>         ===================================================

[Back to top](#patients)

### Edit
Edit information of the patient with the specified NRIC
##### Usage example:
```
edit [nric] [options][editedInput]
  
Options:
    -p edit phone number
    -a edit allergies
    -r edit remarks
```
	

###### Example:
> ***Expected output:***

[Back to top](#patients)

### Delete
Display all the Patients in alphabetical order
##### Usage example:
```
delete [nric]
```
###### Example: 
`delete S1234567A`
> ***Expected output:***

[Back to top](#patients)
