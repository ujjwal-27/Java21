package Revision.InnerClass;

class Outer {
    static class Inner {
        public void show() {
            System.out.println("show inner");
        }
    }
}

public class InnerClassRevision {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();

        inner.show();
    }
}
