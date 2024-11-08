package ThreadConcept;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");
        }
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.start();
        objB.start();
    }
}
