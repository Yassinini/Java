 public class trans2d {

    // Return a NEW 2D array that is the transpose of grid
    // transpose means rows become columns and columns become rows
    // ex: {{1,2,3},{4,5,6}} → {{1,4},{2,5},{3,6}}
    public static int[][] transpose(int[][] grid) {
        // your code here
        int[][] g = new int[grid[0].length][grid.length];
          for (int row=0;row<grid.length;row++){
            for (int col=0; col<grid[0].length; col++){
              g[col][row]=grid[row][col];
            }
          }
        return g;
    }

    // Return true if two 2D arrays are identical
    public static boolean areEqual(int[][] a, int[][] b) {
        // your code here
        if (a.length != b.length || a[0].length != b[0].length){
          return false;
        }
        for(int r=0; r<a.length; r++){
          for (int c=0; c<a[0].length; c++){
            if (a[r][c] != b[r][c]){
              return false;
            }
          }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] t = transpose(grid);
        System.out.println(t[0][0] + " " + t[0][1]); // 1 4
        System.out.println(t[1][0] + " " + t[1][1]); // 2 5
        System.out.println(t[2][0] + " " + t[2][1]); // 3 6

        int[][] x = {{1,2},{3,4}};
        int[][] y = {{1,2},{3,4}};
        int[][] z = {{1,2},{3,5}};
        System.out.println(areEqual(x, y)); // true
        System.out.println(areEqual(x, z)); // false
    }
}
