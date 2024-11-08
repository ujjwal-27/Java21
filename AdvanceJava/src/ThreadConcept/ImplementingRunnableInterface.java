package ThreadConcept;

class AA implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class BB implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        Runnable objA = new AA();
        Runnable objB = new BB();

        Thread threadA = new Thread(objA);
        Thread threadB = new Thread(objB);

        threadA.start();
        threadB.start();
    }
}
