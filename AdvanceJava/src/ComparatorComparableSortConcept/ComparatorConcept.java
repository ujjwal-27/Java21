package ComparatorComparableSortConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorConcept {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() { // we can also use lambda concept for this.

            @Override
            public int compare(Integer n1, Integer n2) {
                if (n1 % 10 > n2 % 10) {
                    return 1; // If the condition is satisfied, swap the number

                } else {
                    return -1; // If not, don't swap
                }
            }
        };

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(83);
        nums.add(29);
        nums.add(11);
        nums.add(57);

        Collections.sort(nums, comp);
        System.out.println(nums);
    }
}
