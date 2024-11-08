package InterfaceConcept;

interface Sports {
    String name = "football";
    int noOfPlayers = 11;

    void categories();
    void selection();
}

class Tournament implements Sports {
    public void categories() {
        System.out.println("categories from class Tournament");
    }

    public void selection() {
        System.out.println("selection from class Tournament");
    }
}

public class InterfaceConcept {
    public static void main(String[] args) {
        Sports obj = new Tournament();

        obj.categories();
        obj.selection();

        System.out.println(Sports.name);
        System.out.println(Sports.noOfPlayers);
    }
}
