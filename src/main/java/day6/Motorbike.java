package day6;

public class Motorbike {
    private int year;
    private String model;
    private String color;

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String info() {
        return "Это мотоцикл";
    }

    public int yearDifference(int inputYear) {
        return inputYear = Math.abs(inputYear - year);

    }
}
