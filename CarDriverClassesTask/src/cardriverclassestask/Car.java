package cardriverclassestask;

public class Car {

    public Car(String type, String company, Driver driver1, String number) {
        this.type = type;
        this.company = company;
        this.driver1 = driver1;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" + "type=" + type + ", company=" + company + ", driver1=" + driver1 + ", number=" + number + '}';
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public Driver getDriver1() {
        return driver1;
    }

    public String getNumber() {
        return number;
    }

    public void setDriver1(Driver driver1) {
        this.driver1 = driver1;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    private String type;
    private String company;
    private Driver driver1;
    private String number;
}
