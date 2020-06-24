package ru.jhonsy.home.musicGenres;

import org.springframework.stereotype.Component;
import ru.jhonsy.home.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author - Ivan Slastikhin
 */
public class ClassicalMusic implements Music {

    private List<String> classicalMusicList = new ArrayList<>();

    {
        classicalMusicList.add("Hungarian Rhapsody");
        classicalMusicList.add("Moon Sonata");
        classicalMusicList.add("Winter");
    }

    @Override
    public List<String> getSongs() {
        return classicalMusicList;
    }
}
