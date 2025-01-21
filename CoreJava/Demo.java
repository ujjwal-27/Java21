class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class Computer {
    public void playMusic() {
        System.out.println("Music playing...");
    }

    public String onlineShop(int cost) {
        if (cost >= 10) {
            return "You bought a product of Rs. " + cost + ".";
        }

        return "Invalid entry.";
    }
}

public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        Calculator calc = new Calculator();
        int result = calc.add(a, b);

        System.out.println(result);

        Computer computer = new Computer();
        computer.playMusic();

        String onlineShop = computer.onlineShop(19);
        System.out.println(onlineShop);
    }
}
