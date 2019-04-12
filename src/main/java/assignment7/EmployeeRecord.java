package assignment7;//type EMPLOYEE_RECORD = {PERSON_BIO_INFO: BIOGRAPHICAL_INFO,PAY_RATE_PER_HOUR:int,NO_OF_HOURS:int};

public class EmployeeRecord {

    private BiographicalInformation biographicalInformation;
    private int payRatePerHour;
    private int noOfHours;

    public BiographicalInformation getBiographicalInformation() {
        return biographicalInformation;
    }

    public void setBiographicalInformation(BiographicalInformation biographicalInformation) {
        this.biographicalInformation = biographicalInformation;
    }

    public int getPayRatePerHour() {
        return payRatePerHour;
    }

    public void setPayRatePerHour(int payRatePerHour) {
        this.payRatePerHour = payRatePerHour;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }
}
