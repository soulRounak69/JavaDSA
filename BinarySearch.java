class BinarySearch
{
	int search(int arr[],int n,int key)
	{
		int s=0,e=n-1,m;
		while(s<=e)
		{
			m=(s+e)/2;
			if(arr[m]==key)
			{
				return m;
			}
			if(key>arr[m])
			{
				s=m+1;
			}
			else if(key<arr[m])
			{
				e=m-1;
			}
			
		}
		return -1;
	}
	public static void main(String args[])
    	{
        		BinarySearch ob = new BinarySearch();
        		int arr[] = { 2, 3, 4, 10, 40 };
       	 	int n = arr.length;
        		int x = 10;
        		int result = ob.search(arr, n,x);
       		if (result == -1)
            		System.out.println("Element is not present in array");
       		 else
            		System.out.println("Element is present at " + "index " + result);
    	}
}