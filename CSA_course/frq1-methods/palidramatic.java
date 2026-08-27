public class palidramatic {

    // Returns the number of digits in a positive integer
    // ex: 1234 → 4, 7 → 1, 100 → 3
    public static int digitCount(int n) {
        // your code here
        String temp = String.valueOf(n);
        return temp.length();
    }

    // Returns true if the number is a palindrome (reads same forwards and backwards)
    // ex: 121 → true, 123 → false, 1 → true
    public static boolean isPalindrome(int n) {
        // your code here — must use digitCount or String conversion
        String s = String.valueOf(n);
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
               
      }

    public static void main(String[] args) {
        System.out.println(digitCount(1234));  // 4
        System.out.println(digitCount(7));     // 1
        System.out.println(digitCount(100));   // 3

        System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(123));   // false
        System.out.println(isPalindrome(1));     // true
        System.out.println(isPalindrome(1221));  // true
    }
}
