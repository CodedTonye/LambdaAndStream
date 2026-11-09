package functions;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {
    public static void main(String[] args) {
//        BiConsumer<String, Integer> biConsumer = (name, age) ->
//                System.out.printf("%s is %d years old\n", name, age);

        Map<String, Integer> map = Map.of(
                "John", 25,
                "James", 28,
                "Boma", 20
        );
        map.forEach((name, age) ->
                System.out.printf("%s is %d years old\n", name, age));
    }
}
