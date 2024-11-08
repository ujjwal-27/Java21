package OptionalClassConcept;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassConcept {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ujjwal", "Lalshmi", "Sneha", "Chelsea");

//        String name = names.stream()
//                            .filter(str -> str.contains("x"))
//                            .findFirst()
//                            .orElse("Not found");
//        System.out.println(name);

        Optional<String> name = names.stream()
                                    .filter(str -> str.contains("x"))
                                    .findFirst();

        System.out.println(name.orElse("Not found"));

    }
}
