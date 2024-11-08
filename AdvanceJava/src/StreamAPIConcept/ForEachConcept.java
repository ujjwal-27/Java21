package StreamAPIConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachConcept {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(25, 18, 37, 80);

//        System.out.println(nums.get(2));
//        System.out.println(nums);
//
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }
//
//        for (int n : nums) {
//            System.out.println(n);
//        }

        // WITHOUT USING LAMBDA
//        Consumer<Integer> consumer = new Consumer<Integer>() {
//            public void accept(Integer n) {
//                if (n % 2 == 0) {
//                    System.out.println(n / 2);
//                }
//            }
//        };

        // USING LAMBDA
        Consumer<Integer> consumer = n -> {
            if (n % 2 == 0) {
                System.out.println(n / 2);
            }
        };

        nums.forEach(consumer);

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(57);
//        numbers.add(29);
//        numbers.add(12);
//        numbers.add(83);
//
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
//
//        numbers.forEach(n -> System.out.println(n));
    }
}
