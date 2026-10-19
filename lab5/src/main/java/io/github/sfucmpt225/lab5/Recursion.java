/**
 * Complete the five methods marked TODO. Each one must be recursive 
 * and must not use loops. Do not rename the class or the methods, and
 * do not change any parameter or return type.
 */
public class Recursion {

    /**
     * Returns n! = n * (n - 1) * ... * 2 * 1. 
     */
    public static long factorial(int n) {
        // TODO: replace this line with your recursive code
        return 0;
    }

    /**
     * Returns the sum of the digits of n. 
     */
    public static int sumDigits(int n) {
        // TODO: replace this line with your recursive code
        return 0;
    }

    /**
     * Returns s with its characters in reverse order.
     */
    public static String reverse(String s) {
        // TODO: replace this line with your recursive code
        return "";
    }

    /**
     * Returns true if s reads the same forwards and backwards. Characters are 
     * case sensitive. The empty string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        // TODO: replace this line with your recursive code
        return false;
    }

    /**
     * Returns arr[start] + arr[start + 1] + ... + arr[arr.length - 1], i.e., the sum
     * of the elements of an int array starting at index `start`.
     * Returns 0 for an empty int array. 
     */
    public static int sumArray(int[] arr, int start) {
        // TODO: replace this line with your recursive code
        return 0;
    }

    /**
     * Prints each test case from the README instructions next to the answer it should give.
     * Do NOT EDIT THIS METHOD.
     */
    public static void main(String[] args) {
        System.out.println("factorial(0)          = " + factorial(0) + "    (should be 1)");
        System.out.println("factorial(4)          = " + factorial(4) + "    (should be 24)");

        System.out.println("sumDigits(5)          = " + sumDigits(5) + "    (should be 5)");
        System.out.println("sumDigits(472)        = " + sumDigits(472) + "    (should be 13)");

        System.out.println("reverse(\"cat\")        = \"" + reverse("cat") + "\"    (should be \"tac\")");
        System.out.println("reverse(\"\")           = \"" + reverse("") + "\"    (should be \"\")");

        System.out.println("isPalindrome(\"level\") = " + isPalindrome("level") + "    (should be true)");
        System.out.println("isPalindrome(\"noon\")  = " + isPalindrome("noon") + "    (should be true)");
        System.out.println("isPalindrome(\"java\")  = " + isPalindrome("java") + "    (should be false)");

        int[] arr = {2, 4, 6};
        System.out.println("sumArray(arr, 0)      = " + sumArray(arr, 0) + "    (should be 12)");
        System.out.println("sumArray(arr, 1)      = " + sumArray(arr, 1) + "    (should be 10)");
        System.out.println("sumArray(arr, 3)      = " + sumArray(arr, 3) + "    (should be 0)");
    }
}
