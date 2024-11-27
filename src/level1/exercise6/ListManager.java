package level1.exercise6;

import java.util.Comparator;
import java.util.List;

public class ListManager {
    public static void printList(List<String> list) {
        List<String> sortedList = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        sortedList.forEach(element -> {
            System.out.println(element);
        });
    }
}
