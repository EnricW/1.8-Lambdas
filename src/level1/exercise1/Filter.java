package level1.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static List<String> filterStringsWithO(List<String> strings) {
        return strings.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}
