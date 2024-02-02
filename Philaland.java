import java.util.*;
class Philaland
{
	int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/2;
			count++;
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Philaland ph = new Philaland();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			int c=ph.count(num);
			System.out.println(c);
		}
		
	}

}