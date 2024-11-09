package Revision.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ujjwal", 27));
        students.add(new Student("Jordon", 22));
        students.add(new Student("Jack", 53));
        students.add(new Student("Elon", 47));

        Collections.sort(students);

        System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).name + " : " + students.get(i).age);
        }
    }
}
