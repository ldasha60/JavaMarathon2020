package day6;

import day6.Car;
import day6.Motorbike;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2014);
        car1.setModel("Mazda");
        car1.setColor("Red");

        Motorbike motorbike1 = new Motorbike(2006, "Yamaha", "White");

        System.out.println(car1.info());
        System.out.println(car1.yearDifference(1996));
        System.out.println(motorbike1.info());
        System.out.println(motorbike1.yearDifference(1996));


    }
}
