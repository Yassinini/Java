public class twodays {

    // Return the sum of all elements in a 2D array
    public static int sumAll(int[][] grid) {
        // your code here
        int sum=0;
        for(int row=0; row<grid.length; row++){
          for (int col=0; col < grid[row].length; col++){
            sum+= grid[row][col];
          }
        }
        return sum;
    }

    // Return the largest element in the 2D array
    public static int findMax(int[][] grid) {
        // your code here
        int max=grid[0][0];
        for (int row=0; row < grid.length; row++){
          for (int col=0; col < grid[row].length; col++){
            if (grid[row][col] > max){
              max=grid[row][col];
            }
          }
        }
        return max;
    }

    // Return the sum of a specific row
    public static int sumRow(int[][] grid, int row) {
        // your code here
        int si=0;
        for (int col=0; col < grid[row].length; col++){
          si+= grid[row][col];
        }
        
        return si;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(sumAll(grid));      // expected: 45
        System.out.println(findMax(grid));     // expected: 9
        System.out.println(sumRow(grid, 1));   // expected: 15
        System.out.println(sumRow(grid, 0));   // expected: 6
    }
}
