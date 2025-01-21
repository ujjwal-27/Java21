class Mobile {
    String brand;
    int price;
    static String type;

    public void details() {
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void details1(Mobile mobile) {
        System.out.println(mobile.brand + " : " + mobile.price + " : " + type);
    }
}

public class StaticConcept {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1500;
        Mobile.type = "Smart";

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 1500;
        Mobile.type = "Smart"; // in this case, this is redundant

        Mobile.type = "Classic";

        mobile1.details();
        mobile2.details();

        Mobile.details1(mobile1);
    }
}
