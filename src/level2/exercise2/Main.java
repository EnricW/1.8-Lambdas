package level2.exercise2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 55, 44);

        String output = ListManager.formatList(numbers);
        System.out.println("Output: " + output);
    }
}
