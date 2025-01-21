class Human {
    private String name;
    private int age;

    public Human() {
        this.name = "Jordon";
        this.age = 28;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationConstructor {
    public static void main(String[] args) {
        Human human = new Human();
        Human humanParam = new Human("Ujjwal", 27);
        System.out.println(human.getName() + " : " + human.getAge());
        System.out.println(humanParam.getName() + " : " + humanParam.getAge());

//        human.name = "Jordon";
//        human.age = 28;
//        System.out.println(human.name + " : " + human.age);

//        human.setName("Jordon");
//        human.setAge(28);
//        System.out.println(human.getName() + " : " + human.getAge());
    }
}
