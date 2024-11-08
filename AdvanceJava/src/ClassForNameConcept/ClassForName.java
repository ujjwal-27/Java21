package ClassForNameConcept;

import java.lang.reflect.InvocationTargetException;

class Student {
    static {
        System.out.println("from static");
    } // static block

    {
        System.out.println("from instance");
    } // instance block
}

public class ClassForName {
    public static void main(String[] args) {
//        Student student = new Student();

        try {
            Class student = Class.forName("ClassForNameConcept.Student"); //  This line will initially load the class, and execute only static block from class 'Student'
            Object obj = student.getDeclaredConstructor().newInstance(); // This line will create new instance (object), and execute instance block from class 'Student'
            // these two line is somewhat equivalent to Student student = new Student();
            // This statement



//            System.out.println(obj);

//        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
//                 InvocationTargetException e) {
//            System.out.println(e);
//        }

        } catch (ReflectiveOperationException e) {
            System.out.println(e);
        }
    }
}
