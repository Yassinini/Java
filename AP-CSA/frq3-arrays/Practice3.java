                           import java.util.ArrayList;

public class Practice3 {

    // Shift all elements left by 1, last element becomes first
    // ex: [1,2,3,4] → [2,3,4,1]
    public static void rotateLeft(ArrayList<Integer> list) {
        // your code here
        int temp = list.get(0);
        for (int i=1; i<list.size(); i++){
          list.set(i-1, list.get(i));
        }
        list.set(list.size()-1, temp);
    }

    // Return true if the ArrayList is sorted in ascending order
    public static boolean isSorted(ArrayList<Integer> list) {
        // your code here
        int count=0;
        for( int q= 1; q < list.size(); q++){
          if (list.get(q) > (list.get(q-1)) ){
            count ++;
          }
        }
        if (count == list.size()-1) return true;
        return false;
    }


    // Replace every negative number with its absolute value
    public static void absoluteAll(ArrayList<Integer> list) {
        // your code here
        for (int p=0; p < list.size(); p++){
          if (list.get(p) < 0){
            list.set(p, Math.abs(list.get(p)));
          }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(1); test1.add(2); test1.add(3); test1.add(4);
        rotateLeft(test1);
        System.out.println(test1); // [2, 3, 4, 1]

        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(1); test2.add(3); test2.add(5); test2.add(7);
        System.out.println(isSorted(test2)); // true

        ArrayList<Integer> test3 = new ArrayList<>();
        test3.add(1); test3.add(4); test3.add(2); test3.add(6);
        System.out.println(isSorted(test3)); // false

        ArrayList<Integer> test4 = new ArrayList<>();
        test4.add(-3); test4.add(5); test4.add(-7); test4.add(2);
        absoluteAll(test4);
        System.out.println(test4); // [3, 5, 7, 2]
    }
}
