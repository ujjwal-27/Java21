package Revision.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(25, 12, 64, 79, 18, 27);

        Stream<Integer> result1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted();

        Integer result2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        System.out.println(numbers); // original data won't be affected from which Stream was created

        // A Stream cannot be used twice
//        System.out.println(result1.toList());
        result1.forEach(System.out::println);

        System.out.println(result2);
    }
}
