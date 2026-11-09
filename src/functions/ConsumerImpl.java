package functions;

import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<String> greet = (name) ->
                System.out.println("Good Day, " + name);

        greet.accept("Tyger");
    }
}
