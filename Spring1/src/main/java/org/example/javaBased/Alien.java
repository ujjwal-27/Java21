package org.example.javaBased;

import org.springframework.stereotype.Component;

/**
 * The @Component annotation determines that the class is Spring-managed component, and automatically registers the class as bean.
 * While running the app, these classes are detected as beans during component scan in the container (AppConfig)
 */
@Component
public class Alien {
    private int age;
    private int salary;
    private Computer computer;

    public Alien() {
        System.out.println("Alien object created");
    }

//    public Alien(int age, int salary, Laptop lap) {
//        System.out.println("Alien param constructor called");
//        this.age = age;
//        this.salary = salary;
//        this.lap = lap;
//    }

    public void code() {
        computer.compile();
    }

    public int getAge() {
        return age;
    }

    public Computer getComputer() {
        return computer;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
