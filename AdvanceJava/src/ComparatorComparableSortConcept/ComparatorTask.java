package ComparatorComparableSortConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Here, we are sorting the strings based on its length
 */
public class ComparatorTask {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length()) {
                    return 1;

                } else {
                    return -1;
                }
            }
        };

        ArrayList<String> brands = new ArrayList<>();

        brands.add("Nike");
        brands.add("Air Jordan");
        brands.add("Gucci");
        brands.add("Adidas");
        brands.add("Puma");

        Collections.sort(brands, comp);
        System.out.println(brands);
    }
}
