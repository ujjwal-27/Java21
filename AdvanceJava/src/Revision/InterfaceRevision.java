package Revision;

interface Student {
    default void message() {
        System.out.println("Message from student interface");
    }
}

public class InterfaceRevision implements Student {
    @Override
    public void message() {
        System.out.println("Message from InterfaceRevision class");
    }

    public static void main(String[] args) {
        InterfaceRevision interfaceRevision = new InterfaceRevision();

        interfaceRevision.message();
    }
}
