package org.example.xml;

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
        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        System.out.println(alien.getSalary());
        alien.code();

//        Laptop laptop = (Laptop) context.getBean("computer"); // This bean will not be accessible here because it is being used as an inner bean for Alien class.
    }
}
