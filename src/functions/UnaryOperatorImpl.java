package functions;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {
    public static void main(String[] args) {
        UnaryOperator<String> convertToLowerCase = (name) ->
                name.toLowerCase();

        String result = convertToLowerCase.apply("GIVER");

        System.out.println(result);
    }
}
