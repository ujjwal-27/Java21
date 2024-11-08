package ConstructorReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private int age;
    private String name;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ujjwal", "Jordon", "Chelsea");

        List<Student> students = new ArrayList<>();

//        for (String name : names) {
//            students.add(new Student(name));
//        }

        students = names.stream()
//                        .map(name -> new Student(name))
                        .map(Student::new)
                        .toList();


//        System.out.println(students.getClass().getSimpleName());
        System.out.println(students);

        students.forEach(student -> System.out.println(student.getName()));
    }
}
