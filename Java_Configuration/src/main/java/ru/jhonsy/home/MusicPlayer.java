package ru.jhonsy.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * @Author - Ivan Slastikhin
 */
public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(){
        Random random = new Random();

        int randomGenreIndex = random.nextInt(musicList.size());
        int randomSongIndex = random.nextInt(3);

        return musicList.get(randomGenreIndex).getSongs().get(randomSongIndex);
    }
}
