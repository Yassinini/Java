public class getsome {

    // Count how many elements are greater than target
    public static int countGreater(int[] arr, int target) {
        // your code here
        int count = 0;
        for (int i=0; i<arr.length; i++){
          if (arr[i] > target){
            count +=1;
          }
        }
        return count;
    }

    // Sum all even numbers in arr
    public static int sumEvens(int[] arr) {
        // your code here
        int si=0;
        for (int j=0; j<arr.length; j++){
          if (arr[j] % 2 == 0){
            si += arr[j];
          }
        }
        return si;
    }

    // Return average of all elements (return -1 if empty)
    public static double average(int[] arr) {
        // your code here
        if (arr.length == 0){
          return -1.0;
        }
        else{
          int sum=0;
          for (int o=0; o<arr.length; o++){
            sum += arr[o];

          }
          double avg= (double)(sum/arr.length);
          return avg;
        }
    }

    public static void main(String[] args) {
        int[] test1 = {3, 7, 1, 9, 4, 6};

        System.out.println(countGreater(test1, 5));  // expected: 3  (7, 9, 6)
        System.out.println(sumEvens(test1));         // expected: 10 (4, 6)  wait no 4+6=10, also check others... 7 no, 1 no, 9 no → 4+6=10
        System.out.println(average(test1));          // expected: 5.0 (3+7+1+9+4+6=30 / 6)

        int[] test2 = {2, 4, 6};
        System.out.println(countGreater(test2, 5));  // expected: 1  (6)
        System.out.println(sumEvens(test2));         // expected: 12
        System.out.println(average(test2));          // expected: 4.0

        int[] test3 = {};
        System.out.println(average(test3));          // expected: -1
    }
}

