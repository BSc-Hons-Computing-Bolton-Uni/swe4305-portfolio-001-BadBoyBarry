package ProjectA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Music Playlist Menu ===");
            System.out.println("1. Add a Song");
            System.out.println("2. Remove a Song");
            System.out.println("3. View Playlist");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = getIntInput(scanner, 1, 4);

            switch (choice) {
                case 1:
                    addSong(scanner, playlist);
                    break;
                case 2:
                    removeSong(scanner, playlist);
                    break;
                case 3:
                    playlist.listSongs();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    return;
            }
        }
    }

    private static void addSong(Scanner scanner, Playlist playlist) {
        String title;
        String artist;
        int plays;

        // Get title
        while (true) {
            System.out.print("Enter song title: ");
            title = scanner.nextLine().trim();
            if (!title.isEmpty()) break;
            System.out.println("Song title cannot be empty.");
        }

        // Get artist
        while (true) {
            System.out.print("Enter artist name: ");
            artist = scanner.nextLine().trim();
            if (!artist.isEmpty()) break;
            System.out.println("Artist name cannot be empty.");
        }

        // Get play count
        while (true) {
            System.out.print("Enter play count: ");
            try {
                plays = Integer.parseInt(scanner.nextLine());
                if (plays < 0) {
                    System.out.println("Play count cannot be negative.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid integer.");
            }
        }

        playlist.addSong(title, artist, plays);
        System.out.println("Song added successfully.");
    }

    private static void removeSong(Scanner scanner, Playlist playlist) {
        System.out.print("Enter the title of the song to remove: ");
        String songToRemove = scanner.nextLine().trim();

        if (songToRemove.isEmpty()) {
            System.out.println("Song title cannot be empty.");
            return;
        }

        boolean removed = playlist.removeSong(songToRemove);
        if (removed) {
            System.out.println("Song removed.");
        } else {
            System.out.println("Song not found in playlist.");
        }
    }

    // Reusable method to get a valid integer within a range
    private static int getIntInput(Scanner scanner, int min, int max) {
        int input = -1;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input < min || input > max) {
                    System.out.print("Please enter a number between " + min + " and " + max + ": ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number between " + min + " and " + max + ": ");
            }
        }
        return input;
    }
}
