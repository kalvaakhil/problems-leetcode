class Solution {
    // public int path(int m,int n,int [][]grid){
    //     if(m==0 && n==0){
    //         return grid[m][n];
    //     }
    //     if(m<0 || n<0){
    //         return (int)1e9;
    //     }
    //     int up=grid[m][n]+path(m-1,n,grid);
    //     int left=grid[m][n]+path(m,n-1,grid);
    //     return Math.min(up,left);

    // }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[i][j];
                }
                else{
                    int up=grid[i][j];
                    if(i>0) up+=dp[i-1][j];
                    else up+=1e9;
                    int left=grid[i][j];
                    if(j>0) left+=dp[i][j-1]; 
                    else left+=1e9;   
                    dp[i][j]=Math.min(up,left);
                }   
            }
        }
        return dp[m-1][n-1];
    }
}
