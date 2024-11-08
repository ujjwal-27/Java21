package ExceptionHandling;

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

       try {
           if (i > 18) {
               throw new MyException("Divisor must be less than 18");
           }

           j = 18 / i;

       } catch (MyException e) {
           System.out.println(e.getMessage());

       } catch (Exception e) {
           System.out.println("Something went wrong");
       }

        System.out.println(j);
    }
}
