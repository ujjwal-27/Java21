package MapConcept;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class MapConcept {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();

        student.put("Jordon", 23);
        student.put("Lucy", 72);
        student.put("Nick", 89);
        student.put("Jordon", 99);

        System.out.println(student);

        System.out.println(student.keySet()); // displays all the 'keys'
        System.out.println(student.values()); // displays all the 'values'

        int sum = 0;

        for (Integer value : student.values()) {
            sum += value;
        }

        for (String key : student.keySet()) {
            System.out.println(key + " : " + student.get(key));
        }

        System.out.println(student.get("Jordon"));

        System.out.println(sum);
    }
}
