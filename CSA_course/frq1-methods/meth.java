public class meth {

    // Returns true if a number is prime
    public static boolean isPrime(int n) {
        // your code here
        if (n <= 1) return false;
        for (int i=2; i < n; i++){
          if (n % i ==0) return false;
        }
        return true;

    }

    // Returns the count of prime numbers from 1 to max (inclusive)
    public static int countPrimes(int max) {
        // your code here — must call isPrime
        int count=0;
        for (int j=1; j <= max; j++ ){
          if (isPrime(j)) count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));   // true
        System.out.println(isPrime(9));   // false
        System.out.println(isPrime(13));  // true
        System.out.println(isPrime(1));   // false

        System.out.println(countPrimes(10));  // expected: 4 (2,3,5,7)
        System.out.println(countPrimes(1));   // expected: 0
        System.out.println(countPrimes(20));  // expected: 8
    }
}
