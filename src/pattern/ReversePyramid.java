package pattern;

import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n*2)-i+1; j++) {
                if(i-j <= 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
