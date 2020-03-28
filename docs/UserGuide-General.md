##General
This section will provide the instruction for the general commands, 
targeted for use to the program.
* [Command Summary](#command-summary)
* [Help](#help)
* [Exit](#exit)

[Return to main](/docs/UserGuide-Main.md)

##Command Summary
Command | Description
---------------|---------------
`help [optional: command]` | Display a help message with all commands or specific commands with usage examples
`exit` | Saves the data to a text file and exits the program

### help
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
>        add /ic[NRIC] /n[NAME] /p[PHONE_NUMBER] /d[DOB] /b[BLOOD_TYPE] [optional: /a[ALLERGIES] /r[REMARKS]]
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

[Back to top](#general)

### Exit
Saves the data to a text file and exits the program
##### Usage example:
```
exit
```

[Back to top](#general)

