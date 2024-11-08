package ExceptionHandling;

class OperationException extends Exception {
    public OperationException(String message) {
        super(message);
    }
}

class A {
    private int i = 0;
    private int j = 0;

    public int result() throws Exception { // using throws keyword to duck exception, and forcing the method where this method is being called, to handle its exception (Here, main method)
        j = 18 / i;

        return j;
    }

    public int getI() { // the instance variable 'i' is private
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

public class DuckingException {
    public static void main(String[] args) {
        A obj = new A();

        try {
            obj.setI(2);

            if (obj.getI() > 18) {
                throw new OperationException("Divisor can't be greater than 18");
            }

            int result = obj.result();

            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
