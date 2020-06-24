package ru.jhonsy.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Random;

/**
 * @Author - Ivan Slastikhin
 */
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicGenres genre){
        Random random = new Random();

        int randomSongIndex = random.nextInt(3);

        switch (genre){
            case ROCK:{
                return "Playing: " + music1.getSongs().get(randomSongIndex);
            }
            case CLASSICAL:{
                return "Playing: " + music2.getSongs().get(randomSongIndex);
            }
        }

        return "Can't play this genre";
    }
}
