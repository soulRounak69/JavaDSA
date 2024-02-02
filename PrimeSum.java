import java.util.*;
class PrimeSum
{
	int count(int num)
	{
		int count =1;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count=0;
				break;
			}
		}
		if(count==0)
		{
			return -1;
		}
		else
		{
			return num;
		}	
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PrimeSum ps = new PrimeSum();
		System.out.println("Enter the no the range  ");	
		int n =sc.nextInt();
		int sum =0;
		int count=0;
		ArrayList <Integer> arr = new ArrayList<Integer>(); 
		for(int i=2;i<=n;i++)
		{
			int d = ps.count(i);
			if(d!=-1)
			{
				arr.add(d);
				//System.out.println(d);	
			}
		}
		
		for(int i=0;i<arr.size();i++)
		{
			
			sum=sum+arr.get(i);
			int d=ps.count(sum);
			
			if(d!=-1&&sum<=n)
			{
				count++;
				System.out.print(d+" ");	
			}
			
		}
		System.out.println();
		System.out.println(count);
	}

}