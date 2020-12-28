package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setYear(2014);
        car1.setModel("Mazda");
        car1.setColor("Red");

        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getColor());
    }
}
