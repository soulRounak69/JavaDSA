import java.util.ArrayList;
import java.util.Scanner;

public class kth_largest_factor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println("Enter the largest number ");
        int k = sc.nextInt();
        
        ArrayList arr = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                arr.add(i);
            }
        }
        System.out.println(arr);
        if(k>arr.size())
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(arr.get(arr.size()-k));
        }
    }
}
