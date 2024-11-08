package Revision;

class Parent {
    public void message() {
        System.out.println("Message from parent");
    }
}

class Child extends Parent {
    public void message() {
        System.out.println("Message from child");
    }

    public void displayMessage() {
        this.message();
    }
}

class AnotherChild extends Parent {
    public void message() {
        System.out.println("Message from another child");
    }
}


public class MethodOverridingRevision {
    public static void main(String[] args) {
//        Parent parent = new Parent();
        Child child = new Child();

//        parent.message();
        child.displayMessage();
    }
}
