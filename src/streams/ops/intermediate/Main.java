package streams.ops.intermediate;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {
        Integer[] numbers = Stream.of(1, 3, 0, 10, 6, 17, 5)
                                    .map((number) -> number * 2)
                                    .map((number) -> number * number)
                                    .filter((number) -> number > 200)
                                    .toArray((number) -> new Integer[number]);
        System.out.println(Arrays.toString(numbers));
    }
}
