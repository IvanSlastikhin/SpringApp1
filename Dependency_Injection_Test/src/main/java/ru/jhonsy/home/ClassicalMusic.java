package ru.jhonsy.home;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author - Ivan Slastikhin
 */
@Component
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
