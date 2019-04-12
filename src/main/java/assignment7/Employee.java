package assignment7;

import java.util.Scanner;

public class Employee {
    public static void main(String args[]) {
        BiographicalInformation biographicalInformation = new BiographicalInformation();
        System.out.println("enter name");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String middleName = sc.nextLine();
        String lastName = sc.nextLine();
        System.out.println("enter the age");
        biographicalInformation.setAge(sc.nextInt());
        System.out.println("enter the gender");
        biographicalInformation.setGender(Gender.FEMALE);
        EmployeeRecord employeeRecord = new EmployeeRecord();
        PersonDetails personDetails = new PersonDetails(firstName,middleName,lastName);
        System.out.println("enter last name that is to be updates");
        String newLastName = sc.nextLine();
        updateLastName(newLastName,personDetails);
        getAgeOfEmp(biographicalInformation);
        biographicalInformation.setGender(Gender.FEMALE);
       System.out.println("employee is a female "+isFemale(biographicalInformation));
       System.out.println("employee is a male "+ isMale(biographicalInformation));
        System.out.println("getRate");
        int rate = sc.nextInt();
        System.out.println("no of hours");
        int hours = sc.nextInt();
        EmployeeRecord record = new EmployeeRecord();
        record.setPayRatePerHour(rate);
        record.setNoOfHours(hours);
        getRateOfEmployee(rate,hours);
        System.out.println("update no of hours");
        int newHours = sc.nextInt();
        updateHoursWorked(employeeRecord,newHours);
    }

    public static void updateLastName(String lastName, PersonDetails personDetails) {
        personDetails.setLastName(lastName);
        System.out.println(personDetails.getFirstName()+" "+personDetails.getMiddleName()+" "+personDetails.getLastName());
    }

    public static void getAgeOfEmp(BiographicalInformation biographicalInformation) {
        System.out.println(biographicalInformation.getAge());
    }

    public static Boolean isFemale(BiographicalInformation biographicalInformation) {
        if(biographicalInformation.getGender().name().equalsIgnoreCase("female")) {
            return true;
        }
        else return false;
    }

    public static Boolean isMale(BiographicalInformation biographicalInformation) {
        if (biographicalInformation.getGender().name().equalsIgnoreCase("male")) {
            return true;
        } else {
            return false;
        }
    }

    public static void getRateOfEmployee(int rate,int hours){
        System.out.println(rate*hours);
    }

    public static void updateHoursWorked(EmployeeRecord employeeRecord,int hours) {
        employeeRecord.setNoOfHours(hours);
        System.out.println(employeeRecord.getNoOfHours());
    }
}
