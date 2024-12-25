package org.example;

public class Alien {
    private int age;
    private Laptop lap;

    public Alien() {
        System.out.println("This is alien");
    }

    public void code() {
        System.out.println("Coding");

        lap.compile();
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
