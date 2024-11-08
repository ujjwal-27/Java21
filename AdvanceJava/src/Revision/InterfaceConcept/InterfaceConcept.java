package Revision.InterfaceConcept;

import java.lang.annotation.Inherited;

interface Calc {
    default int multiply(int x, int y) {
        return x * y;
    }
}

class Shop implements Calc {
    public int add(int x, int y) {
        return x + y;
    }
}

public class InterfaceConcept {
    public static void main(String[] args) {
        Shop shop = new Shop();

        System.out.println(shop.add(2, 6));
        System.out.println(shop.multiply(5, 3));
    }

}
