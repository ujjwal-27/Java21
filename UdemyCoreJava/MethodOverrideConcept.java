class AA {
    public int add(int m, int n) {
        return m + n;
    }
}

class BB extends AA {
    public int add(int m, int n) { // if this method is removed, then the 'add' method from class AA will be called.
        return m + n + 1;
    }
}

public class MethodOverrideConcept {
    public static void main(String[] args) {
        BB obj = new BB();
        System.out.println(obj.add(7, 8));
    }
}
