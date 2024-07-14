package stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frequency {
    public static void main(String[] args) {
        Stream<String> streamFruit = Stream.of("banana", "apple", "banana", "apple", "blue_berry", "grapes", "apple");
        streamFruit.collect(Collectors.groupingBy(
                word -> word
        )).forEach((x, y) -> System.out.println(x+ ": "+ y));
    }
}
