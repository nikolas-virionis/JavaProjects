package virionis.nikolas.playlist;

import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList); // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); // There is no track 24

        play(playList);
    }

    private static void play(LinkedList<Song> playlist) {
        ListIterator<Song> iterator = playlist.listIterator();
        boolean quit = false;
        boolean forward = true;

        if (playlist.size() == 0) {
            System.out.println("Playlist still empty, try adding songs to it to play them later");
            return;
        }
        showMenu();
        System.out.println("Playing " + iterator.next().toString());
        while (!quit) {
            int input = scanner.nextInt();
            scanner.nextLine();
            while (!(input >= 0 && input <= 6)) {
                System.out.println("Invalid input, select one of the options");
                input = scanner.nextInt();
                scanner.nextLine();
            }
            switch (input) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (iterator.hasNext())
                            iterator.next();
                        forward = true;
                    }
                    if (iterator.hasNext())
                        System.out.println("Playing " + iterator.next().toString());
                    else {
                        System.out.println("End of playlist reached");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward && iterator.hasPrevious() || !(iterator.hasNext())) {
                        System.out.println("Playing " + iterator.previous().toString());
                        forward = false;
                    } else {
                        System.out.println("Playing " + iterator.next().toString());
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (iterator.hasPrevious())
                            iterator.previous();
                        forward = false;
                    }
                    if (iterator.hasPrevious())
                        System.out.println("Playing " + iterator.previous().toString());
                    else {
                        System.out.println("Start of playlist reached");
                        forward = true;
                    }
                    break;
                case 4:
                    showMenu();
                    break;
                case 5:
                    printPlaylist(playlist);
                    break;
                case 6:
                    iterator.remove();
                    if (forward) {
                        if (iterator.hasNext())
                            System.out.println("Now playing " + iterator.next());
                        else if (iterator.hasPrevious())
                            System.out.println("Now playing " + iterator.previous());
                        else
                            System.out.println("Empty playlist");
                    } else {
                        if (iterator.hasPrevious())
                            System.out.println("Now playing " + iterator.previous());
                        else if (iterator.hasNext())
                            System.out.println("Now playing " + iterator.next());
                        else
                            System.out.println("Empty playlist");
                    }
            }

        }

    }

    private static void showMenu() {
        System.out.println("Options Menu:");
        System.out.println("\t0 - quit playing");
        System.out.println("\t1 - next song");
        System.out.println("\t2 - replay current song");
        System.out.println("\t3 - previous song");
        System.out.println("\t4 - show Options Menu");
        System.out.println("\t5 - list of songs in playlist");
        System.out.println("\t6 - delete current song");
    }

    private static void printPlaylist(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }
}