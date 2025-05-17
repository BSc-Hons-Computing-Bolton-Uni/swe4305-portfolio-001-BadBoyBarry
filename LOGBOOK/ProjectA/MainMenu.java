package ProjectA;

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

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter play count: ");
                    int plays = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    playlist.addSong(title, artist, plays);
                    System.out.println("Song added successfully.");
                    break;

                case 2:
                    System.out.print("Enter the title of the song to remove: ");
                    String songToRemove = scanner.nextLine();
                    boolean removed = playlist.removeSong(songToRemove);
                    if (removed) {
                        System.out.println("Song removed.");
                    } else {
                        System.out.println("Song not found in playlist.");
                    }
                    break;

                case 3:
                    playlist.listSongs();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    return;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }
    }
}
