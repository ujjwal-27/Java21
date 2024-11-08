package StreamAPIConcept;

import java.util.*;
import java.util.stream.Stream;

public class StreamConcept {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(78, 52, 89, 23, 44); // this creates ArrayList

//        System.out.println(nums.getClass().getSimpleName());

        // Stream implementation - method 1
//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n * 2);
//        int result = s3.reduce(0, (c, e) -> c + e);

        // REDUCED STREAM
        int result = nums.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n / 2)
                        .reduce(0, (c, e) -> c + e);

        System.out.println(result);

        // SORTED STREAM
        Stream<Integer> sorted = nums.stream()
                                    .filter(n -> n % 2 == 0)
                                    .sorted();

        sorted.forEach(n -> System.out.println(n));

//        s1.forEach();
    }
}
