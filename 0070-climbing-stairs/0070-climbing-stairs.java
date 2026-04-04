class Solution {
    public int climbStairs(int n) {
        // if(n==0) return 1;
        // if(n<0) return 0;
        // return climbStairs(n-1)+climbStairs(n-2);
    
        int[] dp =new int[n+1];
        Arrays.fill(dp,-1);
        return find( n,dp);
    }

        int find(int n,int[] dp){
            if(n==0) return 1;
            if(n==1) return 1;
            if(dp[n]!=-1) return dp[n];
            int n1=find(n-1,dp);
            int n2=find(n-2,dp);
            return dp[n]=n1+n2;
        }

    
}