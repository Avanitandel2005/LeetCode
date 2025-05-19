class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if((row*col) != (r*c)) return mat;

        int[][] ans = new int[r][c];

        for(int i=0;i<row*col;i++){
            int oldrow = i/col;
            int oldcol = i%col;

            int newrow = i/c;
            int newcol = i%c;
            ans[newrow][newcol] = mat[oldrow][oldcol];


        }
        return ans;
        
    }
}