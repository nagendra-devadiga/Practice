package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {

        /**
         * convert premetive to wrapper using boxed()
         */

        int[] intArray = new int[]{1, 4, 3, 6, 7, 8, 9, 2};
        Stream<Integer> boxed = Arrays.stream(intArray).boxed();
        List<Integer> i = boxed.sorted((a, b) -> b - a).toList();

        System.out.println(" Sorted descending: "+ i);


        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        Optional<Integer> reduce = limit.reduce((a, c) -> (a > c) ? a : c);

        /**
         * display highest value
         */
        reduce.ifPresent(System.out::println);


        /**
         *      creating a list of Strings
          */

        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);

    }
}
