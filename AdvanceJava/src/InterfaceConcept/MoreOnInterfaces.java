package InterfaceConcept;

interface A {
    void test();
}

interface B {
    void config();
}

interface C extends B { // an interface can extend another interface (more than 1)
    void run();
}

class X implements A, B { // a class can implement more than one interface
    public void test() {
        System.out.println("test in class X");
    }

    public void config() {
        System.out.println("config in class X");
    }
}

class Y implements C {
    public void config() {
        System.out.println("config in class Y");
    }

    public void run() {
        System.out.println("run in class Y");
    }
}

public class MoreOnInterfaces {
    public static void main(String[] args) {
        X obj = new X();
        obj.test();
        obj.config();

        Y obj1 = new Y();
        obj1.config();
        obj1.run();
    }
}
