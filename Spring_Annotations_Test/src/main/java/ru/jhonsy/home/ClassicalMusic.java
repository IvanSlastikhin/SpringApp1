package ru.jhonsy.home;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization...");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction...");
    }

    @Override
    public List<String> getSongs() {
        return classicalMusicList;
    }
}
