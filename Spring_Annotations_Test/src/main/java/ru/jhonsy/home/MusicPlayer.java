package ru.jhonsy.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Author - Ivan Slastikhin
 */
@Component
@Scope("prototype")
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
