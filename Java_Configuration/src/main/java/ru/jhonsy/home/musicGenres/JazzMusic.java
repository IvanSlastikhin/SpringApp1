package ru.jhonsy.home.musicGenres;

import ru.jhonsy.home.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author - Ivan Slastikhin
 */
public class JazzMusic implements Music {
    private List<String> jazzMusicList = new ArrayList<>();

    {
        jazzMusicList.add("Winter");
        jazzMusicList.add("Summer");
        jazzMusicList.add("Autumn");
    }

    @Override
    public List<String> getSongs() {
        return jazzMusicList;
    }
}
