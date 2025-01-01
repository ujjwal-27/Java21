package org.example.javaBased;

import org.example.javaBased.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // creates and initializes Spring IoC container

        Desktop desktop = context.getBean("imac", Desktop.class); // invoking Desktop bean
        desktop.compile();
    }
}
