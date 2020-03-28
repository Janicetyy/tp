# HappyPills
HappyPills is a note-taking application that allows doctors to take down notes using Command Line Interface (CLI). 
The application replaces all physical papers and is highly optimised for fast typing users.
If you can type fast, HappyPills can help to manage patients’ records faster than traditional Graphical User Interface (GUI) applications. 
All notes are neatly organised in HappyPills so that no information of the patients will be missing. 
Say goodbye to messy desks, illegible handwriting, time-consuming handwritten notes with HappyPills!

## Table of Contents
* [Quick Start](#quick-start)
* [Features](#features)
* [Usage](#usage)
    * [General](#general)
        * [Help](#help)
        * [Exit](#exit)
    * [Patient](#patients)
        * [List](#list)
        * [Add](#add)
        * [Get](#get)
        * [Edit](#edit)
        * [Delete](#delete)
    * [FAQ](#faq)
## Quick Start
**Installation**
1. Ensure that you have `Java 11` or later installed in your computer 
2. Click [here](link to be added later?) to download the HappyPills JAR File

**For Window users**
1. Open Command Prompt in the directory where the JAR file is located.
2. Run the command `java -jar happypills.jar`

## Features
Command | Description
---------------|---------------
`help [command]` | Display a help message with all commands or specific commands with usage examples
`list` | Display all the Patients in alphabetical order
<code>add /ic\[NRIC] /n\[NAME] <br>/p\[PHONE_NUMBER] /d\[DOB] <br>/b\[BLOOD_TYPE];</code> | Add a new patient with the specified details.
`get [nric]` | Retrieve details of the patient with the specified NRIC
<code>edit NRIC \[Options]\[editedInput];</code> <br> <code>Options: </Code> <br> <code> -p edit phone number</code><br> <code> -a edit allergies</code> <br> <code> -r edit remarks</code>| Edit information of the patient with the specified NRIC
`delete [nric]` | Deletes a patient with the specified NRIC
`exit` | Saves the data to a text file and exits the program

## Usage
###General
#### help
Display a help message with all commands or specific commands with usage examples
##### Usage example:
*For general help*  
```
help
```

> ***Expected output:***
>
>     ===================================================
>      HappyPills Commands:
>        add /ic[NRIC] /n[NAME] /p[PHONE_NUMBER] /d[DOB] /b[BLOOD_TYPE] /a[ALLERGIES] /r[REMARKS]
>        add /a[ALLERGIES]
>        add /r[REMARKS]
>        list 
>        get [NRIC]
>        edit [OPTIONS][EDITED_INPUT]
>           -p edit phone number
>           -a edit allergies
>           -r edit remarks
>        delete NRIC
>        help
>        exit
>        For more detailed command instructions, enter help [COMMAND].
>      ===================================================
*For specific help*  
```
help [Command]
```
###### Example:
`help get`
> ***Expected output:***
>
>     ===================================================
>     To retrieve a patient's information, run the following command:
>     Note: patient details are within the parenthesis [ ]
>       get [NRIC]
>     Example:
>       get S9999999Z
>     The command above will display information regarding the patient with NRIC S9999999Z.
>     ===================================================
>

#### Exit
Saves the data to a text file and exits the program
##### Usage example:
```
exit
```

###Patients
#### List
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

#### Add
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
>
#### Get
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

#### Edit
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

#### Delete
Display all the Patients in alphabetical order
##### Usage example:
```
delete [nric]
```
###### Example: 
`delete S1234567A`
> ***Expected output:***

## FAQ



## Command Summary



