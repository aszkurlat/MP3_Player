package pl.myPlayer.mp3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MP3Collection {
    private ObservableList<MP3Song> songList;

    public ObservableList<MP3Song> getSongList() {
        return songList;
    }

    public void addSong(MP3Song song) {
        songList.add(song);
    }

    public void addSongs(ObservableList<MP3Song> mp3Songs) {
        songList.addAll(mp3Songs);
    }

    public void clear() {
        songList.clear();
    }

    public MP3Collection() {
        this.songList = FXCollections.observableArrayList();
    }
}