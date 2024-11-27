package level2.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "Leo", "10", "Cristiano Ronaldo", "9", "Eric Garcia", "1234", "Kylian Mbappé", "55555", "Robert Lewandowski"
        ));

        ListManager.printList("\nSorted by first character:", ListManager.sortedByFirstCharacter(list));
        ListManager.printList("\nReplace 'a' with '4':", ListManager.elementsWithEGoFirst(list));
        ListManager.printList("\nElements with 'E' go first:", ListManager.replaceAWith4(list));
        ListManager.printList("\nShow digits only:", ListManager.showDigitsOnly(list));
    }
}