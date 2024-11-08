package InnerClass;

class OuterClass {
    public void show() {
        System.out.println("show in Class A");
    }

    class InnerClass {
        public void show() {
            System.out.println("show in class B");
        }
    }

    static class NestedStaticClass {
        public void show() {
            System.out.println("show in nested static class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.show();

        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.show();

        OuterClass.NestedStaticClass nestedStaticObj = new OuterClass.NestedStaticClass();
        nestedStaticObj.show();
    }
}
