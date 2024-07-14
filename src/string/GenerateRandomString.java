package string;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateRandomString {
    public static void main(String[] args) {
//        System.out.println(getString());
//        System.out.println(getStringJava8());

        String s = "xyzaskjhakd";
        String s1 = s.substring(0, 1).toUpperCase() + s.substring(1);

        char[] CArray = s.toCharArray();
        for (char c: CArray){
            System.out.println(c+" " +(char)(c-32));
        }

        System.out.println(s1);
    }

    public static String getString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return  new String(array, Charset.forName("UTF-8"));
    }

    public static String getStringJava8() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
