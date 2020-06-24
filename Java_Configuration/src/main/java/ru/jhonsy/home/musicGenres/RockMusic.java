package ru.jhonsy.home.musicGenres;

import org.springframework.stereotype.Component;
import ru.jhonsy.home.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author - Ivan Slastikhin
 */
public class RockMusic implements Music {
    private List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("Wind Cries Mary");
        rockMusicList.add("Somewhere I Belong");
        rockMusicList.add("Enjoy The Silence");
    }

    @Override
    public List<String> getSongs() {
        return rockMusicList;
    }
}
