package streams.ops.intermediate;

import java.util.Arrays;
import java.util.List;

public class FlatMapSample {
    static void main(String[] args) {
//        List<String> words = List.of("QWERTY", "WORLD");
//        words.stream()
//              .flatMap((word) -> word.chars().mapToObj((c) -> (char) c))
//              .forEach(System.out::println);

        List<List<Integer>> collections = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        System.out.println(collections.stream()
                .flatMap((numbers) -> numbers.stream())
                .toList());
    }
}
