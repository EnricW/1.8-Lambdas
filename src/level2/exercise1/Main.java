package level2.exercise1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Eva", "Adam", "Ane", "Alex", "Alan", "Ali", "Bob", "Cathy", "David");

        List<String> output = Filter.filterStringsWithAAndLength3(strings);
        System.out.println("Output: " + output);
    }
}