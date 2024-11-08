package InterfaceConcept;

@FunctionalInterface
interface AA {
    void show();
}

class Test implements AA {
    @Override
    public void show() {
        System.out.println("show in Test");
    }
}

public class FuntionalInterface {
    public static void main(String[] args) {
        // An interface cannot be instantiated. But here, we are defining the behaviour of method show()
        AA obj = new AA() {
            @Override
            public void show() {
                System.out.println("show in anonymous inner class");
            }
        };

        obj.show();
    }
}
