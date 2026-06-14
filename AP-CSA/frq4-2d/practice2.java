 public class practice2 {

    // Return the row index of the row with the highest sum
    public static int maxRowIndex(int[][] grid) {
        // your code here
        int bigsum=0;
        int bigid=0;
        int sum=0;
        for (int row=0; row<grid.length; row++){
          sum=0;
          for (int col=0; col<grid[0].length;col++){
            sum+=grid[row][col];
          }
          if (sum > bigsum){
            bigsum=sum;
            bigid= row;
          }
        }
        return bigid;
    }

    // Return true if the grid is a square (same number of rows and columns)
    public static boolean isSquare(int[][] grid) {
        // your code here
         return grid.length == grid[0].length;
    }

    // Count how many elements in the grid are negative
    public static int countNegatives(int[][] grid) {
        // your code here
        int count=0;
        for (int rows= 0; rows<grid.length; rows++){
          for (int cols=0; cols<grid[0].length; cols++){
            if (grid[rows][cols] < 0){
              count++;
            }
          }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {10, 11, 12},
            {4, 5, 6}
        };

        System.out.println(maxRowIndex(grid));   // 1 (row 1 sums to 33)
        System.out.println(isSquare(grid));      // true (3x3)

        int[][] grid2 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        System.out.println(isSquare(grid2));     // false (3x2)

        int[][] grid3 = {
            {-1, 2, -3},
            {4, -5, 6},
            {7, 8, -9}
        };
        System.out.println(countNegatives(grid3)); // 4
    }
}
