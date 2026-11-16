package streams.ops.terminal;

import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> phrases = List.of(
                "All if well",
                "Don't worry be happy",
                "Keep calm and carry on"
        );
        phrases.stream()
                .forEach(System.out::println);   //method reference

    }
}
