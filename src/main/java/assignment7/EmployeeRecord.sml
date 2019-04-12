A person’s name consists of a first name, a middle name and a last name.
 A person’s biographical information consists of his/her name, gender, marital status, and age.
 An employee record consists of a person’s biographical information, the pay rate per hour, and the number of hours worked.
 Give suitable type declarations in SML to describe an employee record.
Also, define the following functions: updateLastName, getAge, isMale, isFemale, getRate, and updateHoursWorked.



type PERSON_NAME = {FIRSTNAME:string,MIDDLENAME:string,LASTNAME:string};
type BIOGRAPHICAL_INFO = {NAME:PERSON_NAME,GENDER:string,AGE:int,MARITALSTATUS:string};
type EMPLOYEE_RECORD = {PERSON_BIO_INFO: BIOGRAPHICAL_INFO,PAY_RATE_PER_HOUR:int,NO_OF_HOURS:int};

datatype firstname = firstName of string;
datatype middlename =  middleName of string;
datatype lastname = lastName of string;
datatype person = Person of firstname*middlename*lastname;
val fullName = Person(firstName "tejaswini",middleName "satya",lastName "kunta");
fun updateLastName(newLastName) =
val newName = fullName(Person(middleName newLastName));
