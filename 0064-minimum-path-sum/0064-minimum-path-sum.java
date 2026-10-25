class Solution {
    public int minPathSum(int[][] grid) {
        int rows=grid.length;
        int cols = grid[0].length;
        int dp[][]= new int[rows][cols];
        for(int i =0 ; i<rows; i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(0,0,grid,dp);

    }
        int fun(int i,int j,int arr[][],int dp[][]){
            int n=arr.length;
            int m = arr[0].length;
            if(i==n-1 && j==m-1) return arr[i][j];
            
            if(i==n || j==m) return Integer.MAX_VALUE;
            if(dp[i][j]!=-1) return dp[i][j];
        int down=fun(i+1,j,arr,dp);
        int right=fun(i,j+1,arr,dp);
        return dp[i][j]= arr[i][j]+Math.min(down,right);
        
    }
}