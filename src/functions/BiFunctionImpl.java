package functions;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (firstNumber, secondNumber) ->
                firstNumber * secondNumber;

        int result = multiply.apply(5, 6);

        System.out.println(result);


    }
}
