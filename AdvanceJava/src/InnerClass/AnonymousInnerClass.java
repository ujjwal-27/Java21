package InnerClass;

class Test {
    public void show() {
        System.out.println("in Test show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Test obj = new Test() {
            public void show() {
                System.out.println("in new Test show");
            }
        };

        obj.show();
    }
}
