package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenerateEmployee {
    public static List<Employee> generateEmployee() {

        char[] genders = new char[] {'M', 'F'};
        List<String> departments = Arrays.asList("Dep1", "Dep2", "Dep3", "Dep4", "Dep5");
        Random random =  new Random();
        int max = departments.size()-1;
        int min = 0;

        List<Employee> empList = new ArrayList<>(10);
        Stream.iterate(1, n -> n+1).limit(20).forEach(
                id -> {
                    String name = GenerateEmployee.getRandomString();
                    double salary = Math.ceil(Math.random()*1000);
                    String department = departments.get(random.nextInt(min, max));
                    char gender = genders[(random.nextInt(0, 2))];
                    int age = random.nextInt(20, 60);
                    int experience = age-20;
                    empList.add(new Employee(id, name, salary, department, gender, experience, age));
                }
        );
        return empList;
    }

    private static String getRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

//        return random.ints(leftLimit, rightLimit + 1)
//                .limit(targetStringLength)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();

        /**
         * example result of random.ints()
         * [97, 98, 97, 122, 120, 98, 99, 97, 100, 103]
         * bounds between 97 and 122+1
         * limits up-to 10 elements
         */
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(
                        StringBuilder::new,
                        (sb, e) -> {
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
                        StringBuilder::append
                )
                .toString();

    }
}
