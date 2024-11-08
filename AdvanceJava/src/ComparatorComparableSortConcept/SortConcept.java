package ComparatorComparableSortConcept;

import java.util.ArrayList;
import java.util.Collections;

public class SortConcept {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(83);
        nums.add(29);
        nums.add(11);
        nums.add(57);

        Collections.sort(nums);

        System.out.println(nums);

        ArrayList<String> brands = new ArrayList<>();

        brands.add("Puma");
        brands.add("Gucci");
        brands.add("Adidas");
        brands.add("Nike");
        brands.add("Adidas");

        Collections.sort(brands);
        System.out.println(brands);
    }
}
