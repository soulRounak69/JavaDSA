public class lcs {
    public static void main(String[] args) {
        String a="ABCAB";
        String b = "AECB";
        int n = a.length();
        int m = b.length();
        System.out.println(lcscount(n,m,a,b));

        
    }
    static int lcscount(int n,int m,String a,String b)
    {
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<m+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        return lcsunit(n,m,a,b,dp);
    }
    static int lcsunit(int n,int m,String a,String b,int dp[][])
    {
        if(n==0||m==0)
        {
            return 0;
        }
        if(dp[n][m]!=-1)
        {
            return dp[n][m];
        }
        if(a.charAt(n-1)==b.charAt(m-1))
        {
            dp[n][m]=1+lcsunit(n-1, m-1, a, b, dp);
            return dp[n][m];
        }
        else
        {
            dp[n][m]=Math.max(lcsunit(n-1, m, a, b, dp),lcsunit(n, m-1, a, b, dp));
            return dp[n][m];
        }

    }
}
