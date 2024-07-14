package createStream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        /**
         * Using Stream.of()
         */
        Stream<String> stream1 = Stream.of("abc", "xyz");
        System.out.println(Arrays.toString(stream1.toArray()));

        /**
         * Using list.stream() method
         */
        List<Integer> list = Arrays.asList(1, 4, 5, 7, 2, 8);
        Stream<Integer> stream2 = list.stream();
        System.out.println(Arrays.toString(stream2.toArray()));

        /**
         * Using Stream.iterator()
         */
        Stream<Integer> stream3 = Stream.iterate(0, n -> n + 1).skip(1).limit(101);
        System.out.println(Arrays.toString(stream3.sorted().toArray()));

        /**
         * Using Stream.generator()
         */
        Stream<Long> stream4 = Stream.generate(() -> Math.round(Math.random()*100)).limit(100).distinct();
        System.out.println(Arrays.toString(stream4.sorted().toArray()));

        /**
         * Using Arrays.stream() -> IntStream, DoubleStream etc.....
         */
        int[] array = {1, 4, 2, 5, 6, 7, 8};
        IntStream stream5 = Arrays.stream(array);
        System.out.println(Arrays.toString(stream5.sorted().toArray()));

        /**
         * Using Stream.empty()
         */
        Stream<String> stream6 = Stream.empty();
        System.out.println(Arrays.toString(stream6.sorted().toArray()));


        /**
         * Using Stream.builder()
         */
        Stream.Builder<String> builder = Stream.builder();
        // Adding elements in the stream of Strings
        Stream<String> stream7 = builder.add("a")
                .add("b")
                .add("c")
                .build();
        System.out.println(Arrays.toString(stream7.sorted().toArray()));
    }
}
