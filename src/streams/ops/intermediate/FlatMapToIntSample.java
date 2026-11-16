package streams.ops.intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class FlatMapToIntSample {
    static void main(String[] args) {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(numbers.stream()
//                .flatMapToInt((number) -> IntStream.of(number.intValue()))
//                .sum()
//        );

        List<List<Integer>> collections = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        System.out.println(collections.stream()
                .flatMapToInt((numbers) -> numbers.stream().mapToInt((number) -> number.intValue()))
                .sum());
    }
}
