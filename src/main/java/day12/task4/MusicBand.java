package day12.task4;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<String> members;

    public MusicBand(String name, int year, ArrayList<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMembers() {
        return members;
    }


    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String member : a.getMembers()) {
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
