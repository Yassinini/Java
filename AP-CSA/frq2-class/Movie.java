// A class representing a Movie.
//
// 1. Instance variables: title (String), rating (double), isReleased (boolean)
// 2. Constructor: takes title and rating, sets isReleased to false by default
// 3. release() — sets isReleased to true
// 4. isAvailable() — returns true if isReleased and rating >= 7.0
// 5. toString() — returns "Movie[title=TITLE, rating=RATING, released=ISRELEASED]"

public class Movie {
    private String title;
    private double rating;
    private boolean isReleased;

    public Movie(String title, double rating){
      this.title = title;
      this.rating= rating;
    }

    public void release(){
      isReleased = true;
    }
    public boolean isAvailable(){
      if (isReleased == true && rating >= 7.0){ 
        return true;
      }
      return false;
    }
    public String toString(){
      return "Move[ title: " + title + ", rating= " + rating +  ", released= " + isAvailable();
    }

    public static void main(String[] args) {
        Movie m = new Movie("Inception", 9.5);
        System.out.println(m.isAvailable());  // false (not released)
        m.release();
        System.out.println(m.isAvailable());  // true
        System.out.println(m);                // Movie[title=Inception, rating=9.5, released=true]

        Movie m2 = new Movie("Flop", 4.0);
        m2.release();
        System.out.println(m2.isAvailable()); // false (rating too low)
    }
}
