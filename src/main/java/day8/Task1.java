package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "";
        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            string += i + " ";
        }
        long after = System.currentTimeMillis();
        System.out.println("no SB - " + (after - before));
        System.out.println(string);

        StringBuilder sb = new StringBuilder();

        long before1 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        long after1 = System.currentTimeMillis();

        System.out.println("SB - " + (after1 - before1));
        System.out.println(sb);

    }

}
