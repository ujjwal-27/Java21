package EnumConcept;

enum Laptop {
    MACKBOOK(2000), DELL(1500), HP, LENOVO(1700);

    private int price;

    private Laptop() {
        this.price = 1200;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.DELL;
        System.out.println(lap + " : " + lap.getPrice());

        Laptop hp = Laptop.HP;
        hp.setPrice(1100);
        System.out.println(hp + " : " + hp.getPrice());
    }
}
