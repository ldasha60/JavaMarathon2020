package day12.task5;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<MusicArtist> members;

    public MusicBand(String name, int year, ArrayList<MusicArtist> members) {
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

    public ArrayList<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (MusicArtist artist : a.getMembers()) {
            b.getMembers().add(artist);
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
