package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int i = 2; // if this is 0, it will give ArithmeticException
        int j = 0;
        int[] numbers = new int[5];
        String str = null;

        try {
            j = 18 / i;
            System.out.println(numbers[4]); // here, if the index is 5, it will give ArrayIndexOutOfBoundException
            System.out.println(str.length());


        } catch (ArithmeticException e) {
            System.out.println("Divisor cannot be zero");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Stay within the range");

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }

        System.out.println(j);
    }
}
