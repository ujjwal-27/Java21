package EnumConcept;

enum Emotions {
    ANGRY, SAD, HAPPY
}

public class EnumIfAndSwitch {
    public static void main(String[] args) {
        Emotions e = Emotions.HAPPY; // let's suppose this data is fetched from database

//        if (e.equals(Emotions.ANGRY)) {
//            System.out.println("..is angry");
//
//        } else if (e.equals(Emotions.SAD)) {
//            System.out.println("..is sad");
//
//        } else {
//            System.out.println("..is happy");
//        }

        switch (e) {
            case ANGRY:
                System.out.println("..is angry");
                break;

            case SAD:
                System.out.println("..is sad");
                break;

            default:
                System.out.println("..is happy");
        }
    }
}
