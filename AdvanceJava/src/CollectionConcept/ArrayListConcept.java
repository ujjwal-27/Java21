package CollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(2);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(7));

        System.out.println(nums);

        for (int n:nums) {
            System.out.println(n);
        }

        int[] demo = new int[2];
        demo[0] = 99;
        demo[1] = 22;

        System.out.println(demo);
        System.out.println(Arrays.toString(demo));
    }
}
