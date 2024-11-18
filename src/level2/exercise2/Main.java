package level2.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 55, 44);

        String output = formatList(numbers);

        System.out.println("Output: " + output);
    }

    public static String formatList(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> (num % 2 == 0 ? "e" : "o") + num)
                .collect(Collectors.joining(", "));
    }
}
