package org.example;

public class Alien {
    private int age;
    private int salary;
    private Laptop lap;

    public Alien() {
        System.out.println("This is alien");
    }

    public Alien(int age, int salary, Laptop lap) {
        System.out.println("Alien param constructor called");
        this.age = age;
        this.salary = salary;
        this.lap = lap;
    }

    public void code() {
        System.out.println("Coding");

        lap.compile(); // Invoking compile() method of Laptop bean/class
    }

    public int getAge() {
        return age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
