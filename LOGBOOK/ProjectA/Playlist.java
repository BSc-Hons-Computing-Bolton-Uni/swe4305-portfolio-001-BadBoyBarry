package ProjectA;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songTitles;
    private ArrayList<String> artistNames;
    private ArrayList<Integer> playCounts;

    public Playlist() {
        songTitles = new ArrayList<>();
        artistNames = new ArrayList<>();
        playCounts = new ArrayList<>();
        seedInitialSongs();
    }

    // Setters
    public void addSong(String title, String artist, int plays) {
        songTitles.add(title);
        artistNames.add(artist);
        playCounts.add(plays);
    }

    // Getters
    public String getSongTitle(int index) {
        return songTitles.get(index);
    }

    public String getArtistName(int index) {
        return artistNames.get(index);
    }

    public int getPlayCount(int index) {
        return playCounts.get(index);
    }

    public int getSize() {
        return songTitles.size();
    }

    public boolean removeSong(String title) {
        int index = songTitles.indexOf(title);
        if (index >= 0) {
            songTitles.remove(index);
            artistNames.remove(index);
            playCounts.remove(index);
            return true;
        }
        return false;
    }

    public void listSongs() {
        if (songTitles.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }

        System.out.println("\n--- Songs in Playlist ---");
        for (int i = 0; i < songTitles.size(); i++) {
            System.out.println("Title: " + getSongTitle(i)
                    + " | Artist: " + getArtistName(i)
                    + " | Plays: " + getPlayCount(i));
        }
    }

    private void seedInitialSongs() {
        addSong("WHAT I WANT", "mellow", 1320725);
        addSong("bodybags", "funeral, glaive", 26334642);
        addSong("Live & Direct", "glaive, kurtains", 14905265);
        addSong("love like that", "endie", 7580261);
        addSong("phobie d'impulsion", "glaive", 36394328);
        addSong("victoria beckham freestyle", "ovine hall", 64821912);
        addSong("play pretend", "cybertrash", 3511846);
        addSong("THE WORLD IS ENDING", "Lil Darkie", 15732639);
        addSong("uk bitches w/kurtains", "ovine hall, kurtains", 16439252);
        addSong("do it for me", "ovine hall", 53826839);
    }
}