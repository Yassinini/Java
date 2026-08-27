// A class that represents a student with a name, grade, and list of scores.
//
// Your task:
// 1. Instance variables: name (String), grade (int), scores (ArrayList<Integer>)
// 2. Constructor: takes name and grade, initializes scores as empty list
// 3. addScore(int score) — adds score to the list
// 4. getAverage() — returns average of all scores as double, return 0.0 if no scores
// 5. isPassing() — returns true if average >= 60
// 6. toString() — returns "Name: [name], Grade: [grade], Average: [average]"

import java.util.ArrayList;

public class Student {
    // your code here
    private String name;
    private int grade;
    private ArrayList<Integer> scores;

    public Student(String name, int grade){
      this.name = name;
      this.grade= grade;
      scores = new ArrayList<>();
    }
    
    public void addScore(int score){
      scores.add(score);
    }

    public double getAverage(){
      if (scores.size() < 1) return 0.0;
      else{
        double sum=0;
        for (int j=0; j<scores.size(); j++){
          sum+= scores.get(j);
        }
        double avg= sum/scores.size();
        return avg;
      } 
    }

    public boolean isPassing(){
      if (getAverage() >= 60){
        return true;
      }else{
        return false;
      }
    }

    public String toString(){
      return "Name: " + name + " ,Grade: " + grade+ " ,Average: " + getAverage();
    }

    public static void main(String[] args) {
        Student s = new Student("Suupa", 10);
        s.addScore(80);
        s.addScore(90);
        s.addScore(70);
        System.out.println(s.getAverage());  // 80.0
        System.out.println(s.isPassing());   // true
        System.out.println(s);               // Name: Suupa, Grade: 10, Average: 80.0

        Student s2 = new Student("Ali", 11);
        System.out.println(s2.getAverage()); // 0.0
        System.out.println(s2.isPassing());  // false
    }
}
