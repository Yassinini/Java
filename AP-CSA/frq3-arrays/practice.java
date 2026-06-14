import java.util.ArrayList;

public class practice {

    // Given an ArrayList of integers, remove all negatives
    public static void removeNegatives(ArrayList<Integer> list) {
        // your code here
        for (int i=list.size()-1; i >= 0; i--){
          if (list.get(i) < 0){
            list.remove(i);
          }
        }
    }

    // Given an int array, return a new ArrayList with only odd numbers
    public static ArrayList<Integer> filterOdds(int[] arr) {
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int j=0; j < arr.length; j++){
          if (arr[j] % 2 !=0){
            list.add(arr[j]);
          }
        }
        return list;
    }

    // Given an ArrayList of integers, return the largest value
    public static int findMax(ArrayList<Integer> list) {
        // your code here
        int id=0;
        for (int o=0; o<list.size(); o++){
          if (list.get(o)> list.get(id)){
            id = o;
          }
        }
        return list.get(id);
    }

    public static void main(String[] args) {
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(-3); test1.add(5); test1.add(-1); test1.add(8); test1.add(-2);
        removeNegatives(test1);
        System.out.println(test1); // [5, 8]

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(filterOdds(arr)); // [1, 3, 5, 7]

        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(10); test2.add(3); test2.add(77); test2.add(42);
        System.out.println(findMax(test2)); // 77
    }
}
