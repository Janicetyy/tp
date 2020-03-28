##Patients
* [List](#list)
* [Add](#add)
* [Get](#get)
* [Edit](#edit)
* [Delete](#delete)
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
>
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

### Delete
Display all the Patients in alphabetical order
##### Usage example:
```
delete [nric]
```
###### Example: 
`delete S1234567A`
> ***Expected output:***


