package Revision;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorRevision {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(89, 23, 72, 51, 90);

        Collections.sort(numbers, (n1, n2) -> {
            if (n1 < n2) {
                return 1;

            } else {
                return -1;
            }
        });

        System.out.println(numbers);
    }
}
