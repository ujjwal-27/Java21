class Sports {
    public void show1() {
        System.out.println("in Sports");
    }
}

class Football extends Sports {
    public void show2() {
        System.out.println("in Football");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        Sports obj = new Football();
        obj.show1();

        Football obj1 = (Football) obj;
        obj1.show2();
    }
}
