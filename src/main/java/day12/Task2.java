package day12;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
