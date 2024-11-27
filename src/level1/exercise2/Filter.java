package level1.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static List<String> filterStringsWithO(List<String> strings) {
        return strings.stream()
                .filter(s -> (s.contains("o") || s.contains("O")) && s.length() > 5)
                .collect(Collectors.toList());
    }
}
