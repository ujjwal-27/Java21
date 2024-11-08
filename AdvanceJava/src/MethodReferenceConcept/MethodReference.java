package MethodReferenceConcept;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ujjwal", "Jordon", "Chelsea");

        List<String> uNames = names.stream()
//                                    .map(name -> name.toUpperCase())
                                    .map(String::toUpperCase)
                                    .sorted()
                                    .toList();

        System.out.println(uNames);
//        uNames.forEach(name -> System.out.println(name));
        uNames.forEach(System.out::println);
    }
}
