class Gadget {
    public void show() {
        System.out.println("show gadget");
    }
}

class Macbook extends Gadget {
    public void show() {
        System.out.println("show macbook");
    }
}

class Ipod extends Gadget {
    public void show() {
        System.out.println("show ipod");
    }
}

class Book {
    public void show() {
        System.out.println("show book");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Gadget obj = new Gadget();
        obj.show();

        obj = new Macbook();
        obj.show();

        obj = new Ipod();
        obj.show();

        // obj = new Book();
        // obj.show();
    }
}
