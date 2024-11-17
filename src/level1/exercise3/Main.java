package level1.exercise3;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        stringStream.forEach(System.out::println);
    }
}