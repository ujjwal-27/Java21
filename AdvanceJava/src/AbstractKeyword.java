abstract class Earth {
    public abstract void home();

    public void food() {
        System.out.println("in Earth food");
    }
}

class Animal extends Earth {
    public void food() {
        System.out.println("in Animal food");
    }

    public void home() {
        System.out.println("in Animal home");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Earth obj = new Animal();

        obj.food();
    }
}
