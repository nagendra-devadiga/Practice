package Array.getMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetMaxItem {
    public static void main(String[] args) {

        // using java 8
        Integer[] array = new Integer[] {2010, 1010, 1001, 1400, 2501};
        List<Integer> list = Arrays.asList(array);
        Integer max = Collections.max(list, Collections.reverseOrder());
        System.out.println("Output from the particular string: "+max);

        // stream
        int[] arr = {7, 16, 10, 2001, 1997};
        int maxArr = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest array is found from the array list: " +maxArr);


        int[] arrs = {7, 16, 10, 2001, 1997};
        int maxArrs = Arrays.stream(arrs).map(a -> a*2).max().getAsInt();
        System.out.println("Largest array is found from the array list: " +maxArrs);


        // collection max
        List<Integer> lists = new ArrayList<>();
        Collections.addAll(lists, array);
        System.out.println("Largest array present in the particular array list is " +Collections.max(lists));



    }
}
