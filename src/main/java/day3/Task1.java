package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = null;

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("Stop")) {
                break;
            }
            switch (s) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    country = "Россия";
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    country = "Италия";
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    country = "Англия";
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    country = "Германия";
                    break;
                default:
                    country = "Неизвестная страна";
                    break;

            }
            System.out.println(country);
        }

    }
}
