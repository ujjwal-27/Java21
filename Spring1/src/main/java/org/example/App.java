package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Creates 'container' in spring
        // When the scope is 'singleton' on a bean tag, the object is also created.
        // But, when the scope is 'prototype' on a bean tag, only the container is created.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // By default, getBean() returns an object. Here, we're typecasting Alien as reference.
        // Since the 'scope' of Alien bean is 'prototype', it creates two different objects as it is being called twice.
        // If the scope is 'singleton', both the reference variable i.e. alien2 and alien2 would refer to same object.
        Alien alien1 = (Alien) context.getBean("alien");
        alien1.age = 27; // if the scope was singleton, this change would be displayed for both objects created i.e. alien1 and alien2
        System.out.println(alien1.age);

        Alien alien2 = (Alien) context.getBean("alien");
        System.out.println(alien2.age);
    }
}
