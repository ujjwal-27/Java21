package Revision.TreeSets;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(27);
        numbers.add(52);
        numbers.add(98);
        numbers.add(27);

//        System.out.println(numbers);

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
