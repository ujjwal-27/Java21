package Revision.Static;

class A {
    int age;
    static int contact;

    public A() {
        System.out.println("A const");
    }

    public void show() {
        System.out.println(age);
    }

    public static void result() {
        System.out.println(A.contact);
    }
}

public class StaticRevision {
    public static void main(String[] args) {
        A a = new A();

        a.show();
    }
}
