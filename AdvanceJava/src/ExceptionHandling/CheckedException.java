package ExceptionHandling;

import java.io.IOException;

// We'll be using Class.forName() as an example of CheckException
class AA {
//    public void displayMessage() {
//        try {
//            Class.forName("Calc");
//        } catch (ClassNotFoundException e) {
//            System.out.println(e);
//        }
//    }

    public void displayMessage() throws ClassNotFoundException { // Class.forName() --> Checked Exception, so compiler forces to handle the exception. Here, we are telling main method to handle the exception for this method (displayMessage)
//        Class.forName("ExceptionHandling.TryCatch"); // Since the 'TryCatch' class is in 'ExceptionHandling' package.
        Class.forName("Calculator"); // class won't be found

        System.out.println("success");
    }
}

public class CheckedException {
    public static void main(String[] args) {
        AA obj = new AA();
//        obj.displayMessage();

        try {
            obj.displayMessage();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
