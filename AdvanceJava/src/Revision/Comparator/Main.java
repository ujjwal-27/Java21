package Revision.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(25);
        nums.add(99);
        nums.add(72);
        nums.add(85);
        nums.add(10);

        Comparator<Integer> comparator = (num1, num2) -> {
            if (num1 % 10 > num2 % 10) {
                return 1;

            } else {
                return -1;
            }
        };

        nums.sort(comparator);

        System.out.println(nums);
    }
}
