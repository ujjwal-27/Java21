package InnerClass;

abstract class Sports {
    public abstract void categories();
}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        Sports sports = new Sports() {
            public void categories() {
                System.out.println("categories from anonymous inner class");
            }
        };

        sports.categories();
    }
}
