package org.example;

import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setRollNo(5);
        s1.setAge(30);
        s1.setName("Jeff");

        System.out.println(s1);

        // code optimization
        Configuration cfg = new Configuration(); // create configuration object to config hibernate session
//        cfg.addAnnotatedClass(org.example.model.Student.class); // locate the model class with annotation '@Entity'
//        cfg.configure(); // invokes the xml-configuration file from 'resources/hibernate.cfg.xml'

        // code optimization
        SessionFactory sessionFactory = cfg.addAnnotatedClass(org.example.model.Student.class)
                                            .configure()
                                            .buildSessionFactory(); // invoke buildSessionFactory() method

        Session session = sessionFactory.openSession(); // open session through session factory

        Transaction transaction = session.beginTransaction(); // start transaction to insert data in database

        session.persist(s1); // inserts data from s1 object to student table. persist() is used in place of save(), which is deprecated.

        // close session and sessionFactory. Always close what's opened.
        session.close();
        sessionFactory.close();

        transaction.commit(); // after inserting the data, finalizing the transaction through commit
    }
}