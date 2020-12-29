package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int big = 0;
        int one = 0;
        int sum = 0;
        int odd = 0;
        int even = 0;

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int j : array) {
            sum += j;
            if (j == 1) {
                one++;
            }
            if (j > 8) {
                big++;
            }
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива - " + array.length);
        System.out.println("Количество чисел больше 8 - " + big);
        System.out.println("Количество чисел равных 1 - " + one);
        System.out.println("Количество четных чисел - " + even);
        System.out.println("Количество нечетных чисел - " + odd);
        System.out.println("Сумма всех элементов массива - " + sum);


    }
}
