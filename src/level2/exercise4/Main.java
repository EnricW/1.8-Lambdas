package level2.exercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Leo", "10", "Cristiano Ronaldo", "9", "Eric Garcia", "1234", "Kylian Mbappé", "55555", "Robert Lewandowski"
        ));

        List<String> sortedByFirstCharacter = list.stream()
                .sorted(Comparator.comparing(s -> s.charAt(0)))
                .toList();

        List<String> elementsWithEGoFirst = list.stream()
                .sorted(Comparator.comparing(s -> s.startsWith("E") ? 0 : 1))
                .toList();

        List<String> replaceAWith4 = list.stream()
                .map(s -> s.contains("a") ? s.replace("a", "4") : s)
                .toList();

        List<String> showDigitsOnly = list.stream()
                .filter(s -> s.chars().allMatch(Character::isDigit))
                .toList();

        System.out.println("\nSorted by first character:");
        sortedByFirstCharacter.forEach(System.out::println);

        System.out.println("\nElements with 'E' go first:");
        elementsWithEGoFirst.forEach(System.out::println);

        System.out.println("\nReplace 'a' with '4':");
        replaceAWith4.forEach(System.out::println);

        System.out.println("\nShow digits only:");
        showDigitsOnly.forEach(System.out::println);
    }
}