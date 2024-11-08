package Revision.LambdaExpression;

interface Calc {
    int add(int x, int y);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Calc calc = Integer::sum;
//        Calc calc = (x, y) -> x + y;
//        Calc calc = new Calc() {
//            public int add(int x, int y) {
//                return x + y;
//            }
//        };

        System.out.println(calc.add(5, 7));

        String str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
