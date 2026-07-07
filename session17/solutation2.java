package session17;

import java.util.LinkedHashMap;
import java.util.Map;

public class solutation2 {

    public static void main(String[] args) {

        LinkedHashMap<String, String> songs = new LinkedHashMap<String, String>();

        songs.put("Perfect", "Ed Sheeran");
        songs.put("Believer", "Imagine Dragons");
        songs.put("Levitating", "Dua Lipa");
        songs.put("Blinding Lights", "The Weeknd");

        System.out.println("Recently Played Songs:");

        for (Map.Entry<String, String> entry : songs.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());

        }
    }
}