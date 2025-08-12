class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length, cols = grid[0].length;
        Set<String> visit = new HashSet<>();
        int islands = 0;
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1' && !visit.contains(r + "," + c)) {
                    dfs(r, c, grid, visit, rows, cols);
                    islands++;
                }
            }
        }
        return islands;
    }
    
    private void dfs(int r, int c, char[][] grid, Set<String> visit, int rows, int cols) {
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0' || visit.contains(r + "," + c)) {
            return;
        }
        visit.add(r + "," + c);
        dfs(r + 1, c, grid, visit, rows, cols);
        dfs(r - 1, c, grid, visit, rows, cols);
        dfs(r, c + 1, grid, visit, rows, cols);
        dfs(r, c - 1, grid, visit, rows, cols);
    }
}