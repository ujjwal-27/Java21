package Revision.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Maths", 97);
        marks.put("Science", 87);
        marks.put("Social", 67);
        marks.put("Computer", 97);
        marks.put("Grammar", 79);

//        marks.remove("Maths");

        System.out.println(marks);
        System.out.println(marks.keySet());
        System.out.println(marks.values());

        for (String key : marks.keySet()) {
            System.out.println(key + " : " + marks.get(key));
        }
    }
}
