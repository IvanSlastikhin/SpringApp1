package ru.jhonsy.home;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.jhonsy.home.configuration.SpringConfig;

/**
 * @Author - Ivan Slastikhin
 */

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}
