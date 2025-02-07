package playlist;

import java.util.Arrays;

public class SongMain {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("Bohemian Rhapsody", "Queen", 354),
                new Song("Imagine", "John Lennon", 183),
                new Song("Hey Jude", "John Lennon", 431),
                new Song("Like a Rolling Stone", "Bob Dylan", 373),
                new Song("Hotel California", "Eagles", 390)
        };
        Arrays.sort(songs,new DurationComparator());
        System.out.println("Sorted by duration (descending):");
        for (Song song : songs) {
            System.out.println(song);
        }
        Arrays.sort(songs,new ArtistTitleComparator());
        System.out.println("Sorted by duration (descending):");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
