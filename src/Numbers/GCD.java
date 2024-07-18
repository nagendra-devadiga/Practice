package Numbers;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner yesOrNo = new Scanner(System.in);
        String continuing = "no";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter second number: ");
            int b = scanner.nextInt();

//        int gcd = gcdBrutForce(a,b);

//            int gcd = gcdEuclid(a, b);
            int gcd = gcdOptimizedEuclid(a, b);
            System.out.println("gdc is: "+ gcd);
            System.out.println("Do you want to continue?");
            continuing = yesOrNo.next();
        } while (continuing.equalsIgnoreCase("yes") || continuing.equalsIgnoreCase("y")); // other than "yes" or "y" it will terminate
    }


    /**
     * Euclid's algorithm
     * 1. find the larger number
     * 2. replace the larger number by the difference between them
     * 3. repeat the steps until the both number equal (i.e difference is 0)
     */
    private static int gcdEuclid(int a, int b) {
        while (a!=b){
            if(a>b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }

    /**
     *  optimized Euclid's algorithm
     * 1. find the larger number
     * 2. replace the larger number by the modulus
     * 3. repeat the steps until any of the number becomes 0
     */
    private static int gcdOptimizedEuclid(int a, int b) {
        while (a!=0 && b!=0){
            if(a>b)
                a = a%b;
            else
                b = b%a;
        }
        return a == 0 ? b : a;
    }

    private static int gcdBrutForce(int a, int b) {
        int min = Math.min(a,b);
        for (int i = min; i >=1 ; i--) {
            if(a%i == 0 && b%i == 0){
                return i;
            }
        }
        return 1;
    }


}
