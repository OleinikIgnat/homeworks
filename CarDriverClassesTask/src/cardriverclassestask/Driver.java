package cardriverclassestask;

public class Driver {

    public Driver(String name, String lastName, int numberOfDrivingLicense) {
        this.name = name;
        this.lastName = lastName;
        this.numberOfDrivingLicense = numberOfDrivingLicense;
    }

    @Override
    public String toString() {
        return "Driver{" + "name=" + name + ", lastName=" + lastName + ", numberOfDrivingLicense=" + numberOfDrivingLicense + '}';
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfDrivingLicense() {
        return numberOfDrivingLicense;
    }
    private String name;
    private String lastName;

    public void setNumberOfDrivingLicense(int numberOfDrivingLicense) {
        this.numberOfDrivingLicense = numberOfDrivingLicense;
    }
    private int numberOfDrivingLicense;
    
}
