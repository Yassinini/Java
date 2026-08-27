import java.util.ArrayList;

public class practice2 {

    // Return the average of all elements in the ArrayList
    // return 0.0 if empty
    public static double average(ArrayList<Integer> list) {
        // your code here
        double sum = 0;
        for (int i=0; i < list.size(); i++){
          sum += list.get(i);
        }
        double avg= sum/list.size();
        return avg;
        
    }

    // Remove all strings shorter than minLength from the list
    public static void removeShort(ArrayList<String> list, int minLength) {
        // your code here
        for (int u=list.size()-1; u >=0; u--){
          if (list.get(u).length() <= minLength){
            list.remove(u);
          }
        }
    }

    // Return new ArrayList containing elements that appear more than once
    // no duplicates in result
    // ex: [1,2,2,3,3,3] → [2,3]
    public static ArrayList<Integer> findDuplicates(ArrayList<Integer> list) {
        // your code here
        ArrayList<Integer> l= new ArrayList<>();
        for (int id =0; id < list.size(); id++){
          for(int j=id+1; j < list.size(); j++){
            if (list.get(j) == list.get(id) && !l.contains(list.get(id))){
              l.add(list.get(id));
            }
          }
        }
        return l;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10); nums.add(20); nums.add(30);
        System.out.println(average(nums));       // 20.0

        ArrayList<String> words = new ArrayList<>();
        words.add("hi"); words.add("elephant"); words.add("ok"); words.add("universe");
        removeShort(words, 3);
        System.out.println(words);               // [elephant, universe]

        ArrayList<Integer> dupes = new ArrayList<>();
        dupes.add(1); dupes.add(2); dupes.add(2); dupes.add(3); dupes.add(3); dupes.add(3);
        System.out.println(findDuplicates(dupes)); // [2, 3]
    }
}
