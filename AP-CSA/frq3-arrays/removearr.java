import java.util.ArrayList;

public class removearr {

    // Remove all elements that are divisible by 3
    public static void removeDivisibleBy3(ArrayList<Integer> arr) {
        // your code here
        for (int i= arr.size()-1; i >=0; i--){
          if (arr.get(i) % 3 == 0){
            arr.remove(i);
          }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(3); test1.add(7); test1.add(9); test1.add(4); test1.add(6);
        removeDivisibleBy3(test1);
        System.out.println(test1); // expected: [7, 4]

        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(1); test2.add(2); test2.add(3);
        removeDivisibleBy3(test2);
        System.out.println(test2); // expected: [1, 2]

        ArrayList<Integer> test3 = new ArrayList<>();
        test3.add(9); test3.add(18); test3.add(27);
        removeDivisibleBy3(test3);
        System.out.println(test3); // expected: []
    }
}
