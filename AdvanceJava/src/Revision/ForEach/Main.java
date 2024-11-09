package Revision.ForEach;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(25, 12, 64, 79, 18, 27);

        Collections.sort(numbers);

        numbers.forEach((number) -> {
            if (number % 2 == 0) {
                int result = number / 2;
                System.out.println(result);
            }
        });
    }
}
