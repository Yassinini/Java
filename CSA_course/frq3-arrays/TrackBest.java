public class TrackBest {


    // YOU WRITE THIS
    // Returns the element in arr closest to target
    // If tie, return the first one found
    public static int closestToTarget(int[] arr, int target) {
        // your code here
        int val=arr[0];
        int dis=Math.abs(arr[0]-target);
        for (int i=0; i < arr.length; i++){
            int d=Math.abs(arr[i]-target);
            if (d < dis){
              dis=d;
              val=arr[i];
            }

        }
        return val;
    }

    public static void main(String[] args) {
        int[] test1 = {10, 22, 14, 3, 8};
        System.out.println(closestToTarget(test1, 9));   // expected: 8

        int[] test2 = {1, 5, 9};
        System.out.println(closestToTarget(test2, 7));   // expected: 5 (diff 2 vs diff 2, first one wins... wait no, 9-7=2, 7-5=2 → 5)

        int[] test3 = {100, 200, 300};
        System.out.println(closestToTarget(test3, 250)); // expected: 200 (tie → first)
                                                         //
                                                         //
        int[] test4 = {-5, -1, 3, 7};
        System.out.println(closestToTarget(test4, 0));   // expected: -1
    }
}
