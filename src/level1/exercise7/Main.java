package level1.exercise7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Leo", "10", "Cristiano Ronaldo", "9", "Neymar Jr", "1234", "Kylian Mbappé", "55555", "Robert Lewandowski"
        ));

        List<String> sortedList = list.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        sortedList.forEach(element -> {
            System.out.println(element);
        });
    }
}
