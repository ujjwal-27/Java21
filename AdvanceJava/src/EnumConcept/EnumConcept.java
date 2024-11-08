package EnumConcept;

enum Status {
    RUNNING, FAILED, PENDING, SUCCESS
}

public class EnumConcept {
    public static void main(String[] args) {
        System.out.println(Status.PENDING);
        Status s = Status.SUCCESS; // here 'Status' is type, s is variable, and Status.SUCCESS in value
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] status = Status.values();
        System.out.println(status[1]);
        for (Status ss:status) {
            System.out.println(ss + ":" +ss.ordinal());
        }
    }
}
