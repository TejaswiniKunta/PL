package assignment7;

public class BiographicalInformation {
    //type BIOGRAPHICAL_INFO = {NAME:PERSON_NAME,GENDER:string,AGE:int,MARITALSTATUS:string};

    private PersonDetails person;
    private Gender gender;
    private int age;
    private String maritalStatus;

    public PersonDetails getPerson() {
        return person;
    }

    public void setPerson(PersonDetails person) {
        this.person = person;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
