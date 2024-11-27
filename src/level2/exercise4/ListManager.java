package level2.exercise4;

import java.util.Comparator;
import java.util.List;

public class ListManager {
    public static List<String> sortedByFirstCharacter(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(s -> s.charAt(0)))
                .toList();
    }

    public static List<String> replaceAWith4(List<String> list) {
        return list.stream()
                .map(s -> s.contains("a") ? s.replace("a", "4") : s)
                .toList();
    }

    public static List<String> elementsWithEGoFirst(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(s -> s.startsWith("E") ? 0 : 1))
                .toList();
    }

    public static List<String> showDigitsOnly(List<String> list) {
        return list.stream()
                .filter(s -> s.chars().allMatch(Character::isDigit))
                .toList();
    }

    static void printList(String message, List<String> list) {
        System.out.println(message);
        list.forEach(System.out::println);
    }
}
