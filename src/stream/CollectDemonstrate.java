package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CollectDemonstrate {
    public static void main(String[] args) {
        List<String> fruitList = Arrays.asList("banana", "apple", "banana", "apple", "blue_berry", "grapes", "apple");

        List<Integer> intList = Arrays.asList(66, 67, 68, 70, 97, 85, 69);

        /**
         * Demonstrating Collectors.toList
         */
        ArrayList<String> collect = fruitList.stream().collect(
                () -> new ArrayList<String>(),
                (list, element) -> list.add(element),
                (list1, list2) -> {
                    list1.addAll(list2);
                }
        );

        /**
         * Simplified
         */
        ArrayList<String> collect1 = fruitList.stream().collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll
        );

        /**
         * Convert Integer to respective ASCII
         */
        intList.stream().collect(
                ArrayList::new, // should be ArrayList<Characters>
                (list, ele) -> list.add( (char)ele.intValue() ),
                ArrayList::addAll
        ).forEach(System.out::println);

        System.out.println(getRandomString());

    }

    private static String getRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        /**
         * example result of random.ints()
         * [97, 98, 97, 122, 120, 98, 99, 97, 100, 103]
         * bounds between 97 and 122+1
         * limits up-to 10 elements
         */
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(
                        StringBuilder::new, // Supplier
                        (sb, e) -> { //BiConsumer  - accumulator ( sb is the supplier of initial step and e is the current processing element)
                            if(sb.isEmpty()) {
                                sb.append((char) (e-32));
                            } else {
                                if(sb.length() == (targetStringLength/2)-1) {
                                    sb.append(" ").append((char) (e-32));
                                } else {
                                    sb.append((char) e);
                                }
                            }
                        },
                        (sb, sb1) -> sb.append(sb1) // BiConsumer - combiner ( sb is the manipulated supplier in step 2 and
                )
                .toString();

    }
}
