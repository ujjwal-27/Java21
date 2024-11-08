package InterfaceConcept;

import java.io.*;

public class Student implements Serializable {
    private String name;
    private int age;
    private int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public static void main(String[] args) {
        // serialization
        Student s1 = new Student("Ujjwal", 28, 97);
        try {
            FileOutputStream fos = new FileOutputStream("serialize_demo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            System.out.println("Student object s1 state saved in file successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialization
        try {
            FileInputStream fis = new FileInputStream("serialize_demo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();
            System.out.println("Student object state retrieved from file successfully");
            System.out.println(s2.name + " : " + s2.age + " : " + s2.marks);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
