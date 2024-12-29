package org.example;

public class Alien {
    private int age;
    private int salary;
    private Computer computer;

    public Alien() {
//        System.out.println("This is alien");
    }

//    public Alien(int age, int salary, Laptop lap) {
//        System.out.println("Alien param constructor called");
//        this.age = age;
//        this.salary = salary;
//        this.lap = lap;
//    }

    public void code() {
//        System.out.println("Coding");

        computer.compile(); // Invoking compile() method of Laptop bean/class
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
//        System.out.println("age setter called");
        this.age = age;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
