package cardriverclassestask;

public class CarDriverClassesTask {
    
    public static void main(String[] args) {
        Driver driver1 = new Driver("Vasya", "Petrov", 722367);
        Car car1 = new Car("Landcruiser", "Mitsubishi", driver1, "XA6384JK");
        System.out.println(car1);
    }
}
