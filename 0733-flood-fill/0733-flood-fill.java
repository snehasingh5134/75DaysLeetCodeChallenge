class Solution {
    public void dfs(int[][] image, int r, int c, int oldCol, int color){
        int nr = image.length;
        int nc = image[0].length;

        if(r < 0 || c < 0 || r >= nr || c >= nc) return;

        if(image[r][c] != oldCol) return;

        image[r][c] = color;

        dfs(image, r-1, c, oldCol, color);
        dfs(image, r+1, c, oldCol, color);
        dfs(image, r, c-1, oldCol, color);
        dfs(image, r, c+1, oldCol, color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldCol = image[sr][sc];

        if(oldCol == color) return image;

        dfs(image, sr, sc, oldCol, color);

        return image;
    }
}