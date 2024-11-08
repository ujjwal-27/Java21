package StreamAPIConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamConcept {
    public static void main(String[] args) {
        final int CAPACITY = 10000;

        List<Integer> nums = new ArrayList<>(CAPACITY);

        Random random = new Random();

        for (int i = 1; i <= CAPACITY; i++) {
            nums.add(random.nextInt(100));
        }

//        int sum1 = nums.stream()
//                        .map(n -> n * 2)
//                        .reduce(0, (c, e) -> c + e);

        long startSequence = System.currentTimeMillis();
        int sum2 = nums.stream()
//                        .map(n -> { // using Thread.sleep()
//                            try {
//                                Thread.sleep(1);
//                            } catch (Exception e) {
//
//                            }
//
//                            return n * 2;
//                        })
                        .map(n -> n * 2)
                        .mapToInt(n -> n)
                        .sum();
        long endSequence = System.currentTimeMillis();


        long startParallel = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
//                        .map(n -> {
//                            try {
//                                Thread.sleep(1);
//                            } catch (Exception e) {
//
//                            }
//
//                            return n * 2;
//                        })
                        .map(n -> n * 2)
                        .mapToInt(n -> n)
                        .sum();
        long endParallel = System.currentTimeMillis();

//        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println("Sequence: " + (endSequence - startSequence));
        System.out.println("Parallel: " + (endParallel - startParallel));

//        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
