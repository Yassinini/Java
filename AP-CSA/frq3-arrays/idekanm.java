import java.util.ArrayList;

public class idekanm {

    // Return a NEW ArrayList containing only elements greater than min
    public static ArrayList<Integer> filterGreaterThan(int[] arr, int min) {
        // your code here
        ArrayList<Integer> PARTY4U = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; i++){
          if (arr[i] > min){
            PARTY4U.add(arr[i]);
          }
        }
        return PARTY4U;
    }

    // Return a NEW ArrayList containing only the strings longer than length n
    public static ArrayList<String> filterLongStrings(String[] arr, int n) {
        // your code here
        ArrayList<String> HAMILTON = new ArrayList<String>();
        for (int j=0; j < arr.length; j++){
          if (arr[j].length() > n){
            HAMILTON.add(arr[j]);
          }
        }
        return HAMILTON;
    }

    public static void main(String[] args) {
        int[] nums = {1, 8, 3, 10, 5, 7};
        System.out.println(filterGreaterThan(nums, 5));  // expected: [8, 10, 7]

        String[] words = {"hi", "elephant", "cat", "universe", "ok"};
        System.out.println(filterLongStrings(words, 3)); // expected: [elephant, universe]
    }
}
