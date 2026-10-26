class Solution {
    private long findsum(int row, int col, int[][] grid, int[][] visited){
        int r = grid.length;
        int c = grid[0].length;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        visited[row][col] = 1;
        long sum = grid[row][col];
        for(int i = 0; i < 4; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >= 0 && nrow < r && ncol >= 0 && ncol < c && visited[nrow][ncol] != 1 && grid[nrow][ncol] > 0){
                sum += findsum(nrow, ncol, grid, visited);
            }
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int noIsland = 0;
        int r = grid.length;
        int c = grid[0].length;
        int[][] visited = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] > 0 && visited[i][j] == 0){
                    long sum = findsum(i, j, grid, visited);
                    if(sum % k == 0) noIsland++;
                }
            }
        }
        return noIsland;
    }
}