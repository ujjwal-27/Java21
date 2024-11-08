package LambdaConcept;

@FunctionalInterface
interface A {
//    void show(int x);
    int add(int x, int y);
}

public class LambdaExpression {
    public static void main(String[] args) {

//        A obj = (int x) -> System.out.println("Value = " + x);
        A obj = (x, y) -> x + y;

//        obj.show(27);
        int result = obj.add(25, 27);
        System.out.println(result);

    }
}
