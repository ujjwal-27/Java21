class A extends Object { // every class (super class in this case) extends Object in java
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        this(); // it calls the default constructor A
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(5); // it calls the parameterized constructor of A, since argument is passed. If the argument is removed, it will call default constructor A.
        System.out.println("in B");
    }

    public B(int n) {
//        super();
        this(); // it calls the default constructor B
        System.out.println("in B int");
    }
}

public class ThisSuperConcept {
    public static void main(String[] args) {
        B obj = new B(9);
    }
}
