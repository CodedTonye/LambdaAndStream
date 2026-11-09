package functions;

import java.util.Map;
import java.util.function.Function;

public class FunctionImpl {
    public static void main(String[] args) {
        Function<String, String> convertToUpperCase = (name) ->
                name.toUpperCase();

        String result = convertToUpperCase.apply("tonye");

        System.out.println(result);



    }
}
