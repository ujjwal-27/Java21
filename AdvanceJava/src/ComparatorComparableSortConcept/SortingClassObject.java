package ComparatorComparableSortConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class Student {
//    String name;
//    int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.age > student.age) {
            return 1;

        } else {
            return -1;
        }
    }
}

public class SortingClassObject {
    public static void main(String[] args) {
//        Comparator<Student> comp = (s1, s2) -> (s1.age > s2.age) ? 1 : -1; // Alternative option: Lambda concept (since Comparator is Functional Interface) and Ternary operator

//        Comparator<Student> comp = new Comparator<Student>() {
//            public int compare(Student s1, Student s2) {
//                if (s1.age > s2.age) {
//                    return 1;
//
//                } else {
//                    return -1;
//                }
//            }
//        };

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ujjwal", 28));
        students.add(new Student("Chris", 57));
        students.add(new Student("Shreya", 22));
        students.add(new Student("Jane", 31));

//        Collections.sort(students, comp);
        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println(students);
    }
}
