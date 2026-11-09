package functions;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isGreaterThan = (firstNumber, secondNumber) ->
                firstNumber > secondNumber;

        boolean result = isGreaterThan.test(10,5);

        System.out.println(result);
    }
}
