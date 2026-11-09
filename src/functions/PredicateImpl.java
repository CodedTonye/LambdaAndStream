package functions;

import java.util.function.Predicate;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) ->
                number % 2 == 0;

        boolean result = isEven.test(4);

        System.out.println(result);
    }
}
