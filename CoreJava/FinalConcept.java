class AAA {
    public final void show() {
        System.out.println("in AAA");
    }
}

class BBB extends AAA{
//    public void show() {
//        System.out.println("in BBB");
//    }


}

public class FinalConcept {
    public static void main(String[] args) {
        final float PI = 3.14F;

        BBB obj = new BBB();
        obj.show();
    }
}
