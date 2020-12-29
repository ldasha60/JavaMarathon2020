package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("AN", 2005, 14, 2000);
        airplane1.setYear(2007);
        airplane1.setLength(20);

        airplane1.fillUp(400);
        airplane1.fillUp(200);

        System.out.println(airplane1.info());

    }
}
