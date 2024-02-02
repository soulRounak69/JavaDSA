class SelectionSort
{
	void Sort(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_idx])
				{
					min_idx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
		}
	}
	public static void main(String args[])
	{
		int arr[]={5,21,4,5,7,89,-3};
		SelectionSort st = new SelectionSort();
		st.Sort(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}