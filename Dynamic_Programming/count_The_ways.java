import java.util.* ;
import java.io.*;
public class count_The_ways {
     

	public static long countDistinctWayToClimbStair(long nStairs) {
		// Write your code here.
		if(nStairs==1||nStairs==0)
		{
			return nStairs;
		}
		else if(nStairs==2)
		{
			return nStairs;
		}
		else
		{
			return (countDistinctWayToClimbStair(nStairs-1)+countDistinctWayToClimbStair(nStairs-2));
		}
		
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            int n = sc.nextInt();
            long d = countDistinctWayToClimbStair(n);
            System.out.println(d);
        }
        
    }
}


