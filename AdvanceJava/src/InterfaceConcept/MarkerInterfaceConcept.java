package InterfaceConcept;

interface permission {

}

class Demo implements permission {
    public void show() {
        System.out.println("show in Demo");
    }
}

public class MarkerInterfaceConcept {
    public static void main(String[] args) {
        Demo obj = new Demo();

        if (obj instanceof permission) { // this is just to show how marker interface works
            obj.show();

        } else {
            System.out.println("No permission");
        }
    }
}
