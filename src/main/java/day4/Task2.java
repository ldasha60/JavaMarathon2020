package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int max = 0;
        int min = 10000;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        for (int j : array) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
            if (j % 10 == 0) {
                count++;
                sum += j;
            }
        }
        System.out.println("Наибольший - " + max);
        System.out.println("Наименьший - " + min);
        System.out.println("количество с 0 - " + count);
        System.out.println("сумма с 0 - " + sum);

    }
}
