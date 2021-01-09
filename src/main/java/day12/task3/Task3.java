package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Tame impala", 2007);
        MusicBand band2 = new MusicBand("The Cure", 1976);
        MusicBand band3 = new MusicBand("The Beatles", 1960);
        MusicBand band4 = new MusicBand("Gruppa Skryptonite", 2018);
        MusicBand band5 = new MusicBand("Cream Soda", 2012);
        MusicBand band6 = new MusicBand("Nirvana", 1987);
        MusicBand band7 = new MusicBand("Pink Floyd", 1965);
        MusicBand band8 = new MusicBand("The Rolling Stones", 1962);
        MusicBand band9 = new MusicBand("U2", 1976);
        MusicBand band10 = new MusicBand("Maroon 5", 2001);

        ArrayList<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));



    }

    public static ArrayList<MusicBand> groupsAfter2000(ArrayList<MusicBand> bands) {
        ArrayList<MusicBand> musicBands = new ArrayList();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000){
                musicBands.add(band);
            }
        }
        return musicBands;
    }
}
