import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        // SIMPLE ARRAY
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10);
        }

        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            System.out.println(number);
        }

        // ARRAY OF OBJECTS
        Student s1 = new Student(); // Student class from ArrayOfObjects.java file
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

        for (Student student : students) {
            System.out.println(student.rollNo + " : " + student.name + " : " + student.age);
        }
    }
}
