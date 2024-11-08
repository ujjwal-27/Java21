package Revision;

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    private class Engine {
        public void start() {
            System.out.println("Engine has started...");
        }
    }

    public void startCar() {
        this.engine.start();
        System.out.println("Car is ready to go.");
    }
}

public class CompositionInnerClass {
    public static void main(String[] args) {
        Car car = new Car();

        car.startCar();
    }
}
