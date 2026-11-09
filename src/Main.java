import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {15, 5, 4, 25, 6, 8, -6};
        Arrays.stream(numbers)
                .map((number) -> number * number)
                .filter((number) -> number > 20)
                .forEach((number) -> System.out.println(number));

        System.out.println(Arrays.toString(numbers));

    }
}