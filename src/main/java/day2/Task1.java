package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();

        if (k >= 1 && k <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (k >= 5 && k <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (k >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (k < 0) {
            System.out.println("Ошибка ввода");
        }


    }
}
