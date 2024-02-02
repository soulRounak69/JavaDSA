import java.util.*;
public class min_cost_coin {
    public static void main(String[] args) {
        int n = 18;
        int arr[] ={1,7,5};
        int dp [] = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        System.out.println(minCost(n, arr,dp));
        for(int i=0;i<n+1;i++)
        {
            System.out.print(dp[i]+" ");
        }
    }
    static int minCost(int n,int arr[],int dp[])
    {
        int ans = Integer.MAX_VALUE;
        if(n==0)
        {
            return 0;
        }
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                if(n-arr[i]>=0)
                {
                    int subans =0;
                    if(dp[n-arr[i]]!=-1)
                    {
                        subans = dp[n-arr[i]];
                    }
                    subans=minCost(n-arr[i],arr,dp);
                    if(subans!=Integer.MAX_VALUE&&subans+1<ans)
                    {
                        ans = subans+1;
                    }
                }

            }
            dp[n]=ans;
            return dp[n];
        }
    }
}
