package level1.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<String> filterStringsWithO(List<String> strings) {
        return strings.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Michael", "Jordan", "Kobe", "Bryant");

        List<String> output = filterStringsWithO(strings);
        System.out.println("Output: " + output);
    }
}