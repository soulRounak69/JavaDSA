class BubbleSort
{
	void sort(int arr[],int n)
	{	
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		BubbleSort bs = new BubbleSort();
		int arr[]={2,7,8,9,10};
		bs.sort(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}