package pattern;

import java.util.ArrayList;

public class SingleLoop {
    public static void main(String[] args) {
        int n = 5;
        StringBuffer sb = new StringBuffer();
        System.out.println("------------------------------------------");
        for (int i = 0; i < 5; i++) {
            sb.append("*");
            System.out.println(sb);
        }

        System.out.println("------------------------------------------");
        sb.delete(0, sb.length());
        sb.append("*****");
        for (int i = 0; i < n; i++) {
            System.out.println(sb);
            sb.deleteCharAt(0);
        }


        System.out.println("------------------------------------------");
        sb.delete(0, sb.length());
        sb.append("     ");
        for (int i = 0; i < n; i++) {
            sb.deleteCharAt(0);
            sb.append("*");
            System.out.println(sb);
        }


        System.out.println("------------------------------------------");
        sb.delete(0, sb.length());
        sb.append("*****");
        for (int i = 0; i < n; i++) {
            System.out.println(sb);
            sb.deleteCharAt(0);
            sb.append(" ");
        }

    }
}
