package ru.jhonsy.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author - Ivan Slastikhin
 */

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic(MusicGenres.CLASSICAL));
        System.out.println(musicPlayer.playMusic(MusicGenres.ROCK));

        context.close();
    }
}
