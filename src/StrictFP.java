// It is used in Java for restricting floating-point calculations
// Ensuring the same result on every platform while performing operations in the floating-point variable.
// Floating-point calculations are platform-dependent i.e. different output (floating-point values) is achieved when a class file is run on different platforms (16/32/64-bit processors)

public class StrictFP {

    // Method 1
    // Calculating sum using strictfp modifier
    public strictfp double sum()
    {
        double num1 = 10e+10;
        double num2 = 6e+08;
        // Returning the sum
        return (num1 + num2);
    }

    // Method 2
    // Main driver method
    public static void main(String... args)
    {
        // Creating object of class in main() method
        StrictFP t = new StrictFP();

        // Here we have error of putting strictfp and
        // error is not found public static void main method
        System.out.println(t.sum());
    }
}