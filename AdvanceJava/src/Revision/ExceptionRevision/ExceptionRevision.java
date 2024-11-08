package Revision.ExceptionRevision;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionRevision {
    public static void main(String[] args) {
        int i = 17;
        int j = 0;

        try {
            if (i > 17) {
                throw new MyException("Not more than 17");
            }

            j = 17 / i;

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(j);
    }
}
