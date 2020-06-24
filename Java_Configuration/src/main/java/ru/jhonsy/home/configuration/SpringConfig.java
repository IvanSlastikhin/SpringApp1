package ru.jhonsy.home.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.jhonsy.home.*;
import ru.jhonsy.home.musicGenres.ClassicalMusic;
import ru.jhonsy.home.musicGenres.JazzMusic;
import ru.jhonsy.home.musicGenres.RockMusic;

import java.util.Arrays;
import java.util.List;

/**
 * @Author - Ivan Slastikhin
 */
@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    //this is for training

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(rockMusic(), classicalMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
