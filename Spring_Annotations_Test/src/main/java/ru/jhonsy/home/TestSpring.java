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

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("MusicPlayer1 name: " + musicPlayer1.getName());
        System.out.println("MusicPlayer1 volume: " + musicPlayer1.getVolume());
        System.out.println("MusicPlayer2 name: " + musicPlayer2.getName());
        System.out.println("MusicPlayer2 volume: " + musicPlayer2.getVolume());

        musicPlayer1.setName("Some name");
        musicPlayer1.setVolume(10);

        System.out.println("MusicPlayer1 name: " + musicPlayer1.getName());
        System.out.println("MusicPlayer1 volume: " + musicPlayer1.getVolume());
        System.out.println("MusicPlayer2 name: " + musicPlayer2.getName());
        System.out.println("MusicPlayer2 volume: " + musicPlayer2.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        context.close();
    }
}
