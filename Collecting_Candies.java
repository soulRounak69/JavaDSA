import java.util.ArrayList;

public class Collecting_Candies {
    void count(int arr[],int n)
    {
        int sum=arr[0]+arr[1];
        ArrayList <Integer> a = new ArrayList<>();
        a.add(sum);
        if(n>2)
        {
        for(int i=2;i<n;i++)
        {
           
            sum=sum+arr[i];
            a.add(sum);
        }
        }
        
        for(int i=0;i<a.size()-1;i++)
        {
            sum=sum+a.get(i);
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Collecting_Candies cc = new Collecting_Candies();
        int arr[]={1,2,3,4};
        cc.count(arr,4);
        //System.out.println(sum);
        
    }
}
