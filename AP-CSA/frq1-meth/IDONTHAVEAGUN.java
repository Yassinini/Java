public class IDONTHAVEAGUN {

    // Returns true if a string has all unique characters
    // ex: "hello" → false, "world" → false, "cat" → true
    public static boolean allUnique(String s) {
        // your code here
       for (int i = 0; i < s.length(); i++) {
          for (int j = i + 1; j < s.length(); j++) {
          if (s.charAt(i) == s.charAt(j)) return false;
          }
        }
        return true; 
    }

    // Returns the most frequent character in a string
    // if tie, return the first one that appears
    // ex: "hello" → 'l', "aabb" → 'a'
    public static char mostFrequent(String s) {
        // your code here
        char bestchar= s.charAt(0);
        int bescunt=0;
        for (int i=0 ; i<s.length(); i++){
          int count=0;
          for (int j = 0; j < s.length(); j++){
            if (s.charAt(i) == s.charAt(j)) count++;
          }
          if (count > bescunt){
            bescunt = count;
            bestchar = s.charAt(i);
          }
        }
        return bestchar;
    }

    public static void main(String[] args) {
        System.out.println(allUnique("cat"));    // true
        System.out.println(allUnique("hello"));  // false
        System.out.println(allUnique("abc"));    // true

        System.out.println(mostFrequent("hello"));  // l
        System.out.println(mostFrequent("aabb"));   // a
        System.out.println(mostFrequent("x"));      // x
    }
}
