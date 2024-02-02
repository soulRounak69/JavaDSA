public class knapsack {
public static void main(String[] args) {
    int profit[] = { 60, 100, 120 }; 
        int weight[] = { 10, 20, 30 }; 
  
        int W = 50; 
        int N = profit.length; 
  
        System.out.println(knapsack(W, weight, profit, N)); 
    
}
    static int knapsack(int w,int wt[],int pro[],int n)
    {
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<w+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        return knapsackrec(w,wt,pro,dp,n);
       

    }
    static int knapsackrec(int w,int wt[],int pro[],int [][]dp,int n)
    {
        if(n==0||n==1)
        {
            return 0;
        }
        else if(dp[n][w]!=-1)
        {
            return dp[n][w];
        }
        else if(wt[n-1]>w)
        {
            return knapsackrec(w, wt, pro, dp, n-1);
        }
        else
        {
            dp[n][w]=Math.max(pro[n-1]+knapsackrec(w-wt[n-1], wt, pro, dp, n-1),knapsackrec(w, wt, pro, dp, n-1));
            return dp[n][w];
        }
    }
}
