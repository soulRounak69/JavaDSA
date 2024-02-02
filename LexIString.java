import java.util.*;
class LexiString
{
	int count(String str,char chr)
	{
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==chr)
			{
				return i;
			}
			
		}
		return -1;
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LexiString ls = new LexiString();
		System.out.println("Enter the no ");
		int n = sc.nextInt();
		ArrayList <Integer>arr = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			
			String str = sc.next();
			String chr = sc.next();
			
			
			for(int j=0;j<chr.length();j++)
			{
				int d = ls.count(str,chr.charAt(j));
				if(d!=1)
				arr.add(d);
				//System.out.println("KKKKKKKK");
			}
			Collections.sort(arr);
			for(int k=0;k<arr.size();k++)
			{
				int idx = arr.get(k);
				System.out.print(str.charAt(idx));
				
			
			}
			
		}
		
		
		
	}

}