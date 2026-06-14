public class practice1 {

    // Return the sum of a specific column
    public static int sumColumn(int[][] grid, int col) {
        // your code here
        int sum=0;
        for (int row=0; row<grid.length; row ++){
          sum+=grid[row][col];
        }
        return sum;
    }

    // Return true if any row sums to a target value
    public static boolean rowSumsToTarget(int[][] grid, int target) {
        // your code here
        int s=0;
        for( int rows=0; rows<grid.length; rows++){
          s=0;
          for (int cols=0; cols<grid[0].length; cols++){
            s += grid[rows][cols];
          }
          if (s == target){
            return true;
          }
        }
        return false;
    }

    // Replace all values greater than max with max
    public static void capValues(int[][] grid, int max) {
        // your code here
        for (int r=0; r<grid.length; r++){
          for (int c=0; c<grid[0].length; c++){
            if (grid[r][c]> max){
              grid[r][c]=max;
            }
            }
          }
        }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(sumColumn(grid, 0));        // 12 (1+4+7)
        System.out.println(sumColumn(grid, 2));        // 18 (3+6+9)
        System.out.println(rowSumsToTarget(grid, 15)); // true (4+5+6)
        System.out.println(rowSumsToTarget(grid, 99)); // false

        capValues(grid, 5);
        // grid becomes {{1,2,3},{4,5,5},{5,5,5}}
        System.out.println(grid[1][2]); // 5
        System.out.println(grid[2][0]); // 5
    }
}
