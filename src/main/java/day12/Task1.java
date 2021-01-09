package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /* Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
        Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("MERCEDES");
        list.add("FERRARI");
        list.add("TESLA");
        list.add("VOLVO");
        System.out.println(list);

        list.add(3,"MAZDA");
        list.remove(0);
        System.out.println(list);

    }
}
