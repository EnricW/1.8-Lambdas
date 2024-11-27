package level1.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Michael", "Jordan", "Kobe", "Bryant", "Oscar");

        List<String> output = Filter.filterStringsWithO(strings);
        System.out.println("Output: " + output);
    }
}