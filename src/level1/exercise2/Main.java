package level1.exercise2;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Michael", "Jordan", "Kobe", "Bryant")
                .filter(s -> s.contains("o") && s.length() > 5);

        stringStream.forEach(System.out::println);
    }
}