public class RecursiveFactorial {
    public static void main(String[] args) {
        int number = 5; // Replace with the number for which you want to calculate the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            // Base case: factorial of 0 is 1
            return 1;
        } else {
            // Recursive case: factorial(n) = n * factorial(n - 1)
            return n * calculateFactorial(n - 1);
        }
    }
}
