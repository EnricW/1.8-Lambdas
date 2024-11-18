package level2.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<String> filterStringsWithAAndLength3(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("A") && s.length() == 3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Eva", "Adam", "Ane", "Alex", "Alan", "Ali", "Bob", "Cathy", "David");

        List<String> output = filterStringsWithAAndLength3(strings);
        System.out.println("Output: " + output);
    }
}