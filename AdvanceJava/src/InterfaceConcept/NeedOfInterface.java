package InterfaceConcept;

interface Computer {
    void code();
}

class Desktop implements Computer {
    public void code() {
        System.out.println("fast: code, compile, run");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Developer {
    public void devApp(Computer computer) { // the devApp method accepts Computer interface as an argument
        computer.code();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Computer laptop = new Laptop(); // interface reference, class object
        Computer desktop = new Desktop(); // interface reference, class object

        Developer developer = new Developer();
        developer.devApp(desktop); // you can pass either laptop or desktop as parameter. The result will be based on the behaviour (logic) of the object.
    }
}
