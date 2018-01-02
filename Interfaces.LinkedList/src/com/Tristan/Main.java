package com.Tristan;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Album Name", "Cool Band");
        album.addSong("song 1", 5.2);
        album.addSong("song 2", 2.2);
        album.addSong("song 3", 4.5);
        album.addSong("song 4", 7.5);
        album.addSong("song 5", 4.1);
        album.addSong("song 6", 6.5);
        album.addSong("song 7", 4.2);
        album.addSong("song 8", 2.3);
        album.addSong("song 9", 3.9);
        album.addSong("song 10", 4.2);
        albums.add(album);

        album = new Album("Pushing Buttons", "Grinspoon");
        album.addSong("Snap your fingers snap your neck", 4.52);
        album.addSong("Black Friday", 5.21);
        album.addSong("Just Ace", 2.22);
        album.addSong("Happy", 4.10);
        albums.add(album);

        List<Song> playlist = new ArrayList<Song>();
        albums.get(0).addToPlaylist("song 1", playlist);
        albums.get(0).addToPlaylist("song 2", playlist);
        albums.get(0).addToPlaylist("song", playlist);
        albums.get(0).addToPlaylist(3, playlist);

        play(playlist);
    }

    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        forward = false;
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("available actions: \npress");
        System.out.println("0 - Quit\n" +
                "1 - Play next song\n" +
                "2 - Play previous song\n" +
                "3 - Replay current song\n" +
                "4 - List songs in current playlist\n" +
                "5 - Print available options\n" +
                "6 - Delete current song from playlist");
    }

    private static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=========");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=========");
    }
}

