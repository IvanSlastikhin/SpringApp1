package ru.jhonsy.home;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author - Ivan Slastikhin
 */
@Component
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
