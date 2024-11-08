import java.util.Arrays;

class Student {
    int rollNo;
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 8;
        s1.name = "Jordon";
        s1.age = 28;

        Student s2 = new Student();
        s2.rollNo = 1;
        s2.name = "Christy";
        s2.age = 25;

        Student s3 = new Student();
        s3.rollNo = 5;
        s3.name = "Katie";
        s3.age = 25;

        Student[] students = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rollNo + " : " + students[i].name + " : " + students[i].age);
        }

//        System.out.println(Arrays.toString(students));
    }
}
