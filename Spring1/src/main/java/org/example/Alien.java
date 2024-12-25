package org.example;

public class Alien {
    private int age;

    public Alien() {
        System.out.println("This is alien");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }

    public void code() {
        System.out.println("Coding");
    }
}
