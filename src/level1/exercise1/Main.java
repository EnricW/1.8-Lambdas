package level1.exercise1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Michael", "Jordan", "Kobe", "Bryant")
                .filter(s -> s.contains("o"));

        stringStream.forEach(System.out::println);
    }
}