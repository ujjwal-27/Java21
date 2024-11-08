package AnnotationConcept;

import java.lang.annotation.Inherited;

class A {
    public void show() {
        System.out.println("show in A");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("show in B");
    }

    @Deprecated
    public static void result() {
        System.out.println("Result in B");
    }
}

public class Annotation {
//    @SuppressWarnings({"deprecation"}) // In this example, the @SuppressWarnings annotation is used to suppress warnings for both unchecked operations and the use of deprecated elements

    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        B.result();
    }
}
