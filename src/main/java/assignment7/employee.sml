datatype firstname = firstName of string;
datatype middlename =  middleName of string;
datatype lastname = lastName of string;
datatype person = Person of firstname*middlename*lastname;
val fullName = Person(firstName "tejaswini",middleName "satya",lastName "kunta");
fun updateLastName(Person(_,_,_),lastNName) = Person(_,_,lastNName);

    //type BIOGRAPHICAL_INFO = {NAME:PERSON_NAME,GENDER:string,AGE:int,MARITALSTATUS:string};
    datatype genderOfPerson =  male|female;

datatype personinfo = personInfo of person;
datatype  gender = Gender of genderOfPerson;
datatype age = Age of int;
datatype maritalstatus = maritalStatus of string;
datatype bioinfo = BioInfo of personinfo*gender*age*maritalstatus;
val myBio = BioInfo(personInfo fullName,Gender female,Age 20,maritalStatus "single");

fun isMale(BioInfo(_,Gender g,_,_)) =
    if g= male then true else false;
/* isMale(myBio);
    * false
    */
fun isfemale(BioInfo(_,Gender g,_,_)) =
    if g= female then true else false;
    /* isfemale(myBio);
    * true
    */
fun getAge(BioInfo(_,_,Age a,_)) =
    let val age = a in age end;
/*  getAge(myBio);
* 20
*/

fun getAge(BioInfo(_,_,Age a,_)) =
let val age = a in age end;
//type EMPLOYEE_RECORD = {PERSON_BIO_INFO: BIOGRAPHICAL_INFO,PAY_RATE_PER_HOUR:int,NO_OF_HOURS:int};

datatype empbio = empInfo of bioinfo;
datatype payrate = PayRate of int;
datatype hours = noOfHours of int;
datatype employee = EmployeeRecord of empbio*payrate*hours;
val firstEmp = EmployeeRecord(empInfo myBio,PayRate 20,noOfHours 40);

fun getRate(EmployeeRecord(_,PayRate r,noOfHours h)) =
let fun gR(rate,hours) = rate*hours in gR(r,h) end;