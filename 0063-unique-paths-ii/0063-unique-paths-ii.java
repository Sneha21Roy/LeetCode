class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n =obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
         Arrays.fill(dp[i],-1);
      }
      return findPath(0,0,m,n,obstacleGrid,dp);

    }
    int findPath(int i,int j,int m,int n,int obstacleGrid[][],int dp[][]){
        if(i>=n || j>=m) return 0;
        if(obstacleGrid[i][j]==1) return 0;
        if(i==n-1 && j==m-1) return 1;
        
        if(dp[i][j]!=-1)
        return dp[i][j];
        int down=findPath(i+1,j,m,n,obstacleGrid,dp);
        int right=findPath(i,j+1,m,n,obstacleGrid,dp);
        return dp[i][j]=down+right;
    }
}