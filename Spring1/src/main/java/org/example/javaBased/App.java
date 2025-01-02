package org.example.javaBased;

import org.example.javaBased.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // creates and initializes Spring IoC container

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();

//        Desktop desktop = context.getBean(Desktop.class); // invoking Desktop bean
//        desktop.compile();
//
//        Desktop desktop1 = context.getBean(Desktop.class); // invoking Desktop bean
//        desktop.compile();
    }
}
