package functions;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (number1, number2) ->
                number1 + number2;

        int result = add.apply(5, 10);

        System.out.println(result);
    }
}
