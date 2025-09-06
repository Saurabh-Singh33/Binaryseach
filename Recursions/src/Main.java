public class Main {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {  // Base case
            return 1;
        } else {       // Recursive call
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;  // Example number
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
    }
}
