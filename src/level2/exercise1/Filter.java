package level2.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static List<String> filterStringsWithAAndLength3(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("A") && s.length() == 3)
                .collect(Collectors.toList());
    }
}