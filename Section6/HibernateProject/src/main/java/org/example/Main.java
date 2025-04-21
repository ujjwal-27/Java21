package org.example;

import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setAge(29);
        s1.setName("Ujjwal");
        s1.setRollNo(7);

        System.out.println(s1);

        Configuration config = new Configuration(); // create configuration object to config hibernate session
        SessionFactory sessionFactory = config.buildSessionFactory(); // invoke buildSessionFactory() method
        Session session = sessionFactory.openSession(); // open session through session factory

        session.save(s1);
    }
}