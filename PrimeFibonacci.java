import java.util.*;

class PrimeFibonacci
{
    int prime(int n)
    {

        int count =1;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count=0;
            }
           
        } 
        if(count==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
        
    }
    long fibonacci(long a,long b,int c)
    {
        long sum=0;
        for(int i=1;i<=c;i++)
        {
            sum=a+b;
            //System.out.println(sum);
            a=b;
            b=sum;
           
        }
        return sum;
        
    }
    public static void main(String[] args) {
        PrimeFibonacci pf = new PrimeFibonacci();
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> prime1  = new ArrayList<>();
        ArrayList <Integer> prime2 = new ArrayList<>();
        System.out.println("Enter the n1 ");
        int n1 = sc.nextInt();
        System.out.println("Enter the n2 ");
        int n2= sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(pf.prime(i)==1)
            {
                prime1.add(i);

            }
        }
        for(int i=0;i<prime1.size();i++)
        {
            for(int j=0;j<prime1.size();j++)
            {
                int cart_pdt=Integer.parseInt(String.valueOf(prime1.get(i))+String.valueOf(prime1.get(j)));
                
                
                if(pf.prime(cart_pdt)==1&&prime2.indexOf(cart_pdt)<0)
                {
                    prime2.add(cart_pdt);
                }
            }
            
        }
        System.out.println(prime1);
        System.out.println(prime2);
        Collections.sort(prime2);
        int min=prime2.get(0);
        int max =prime2.get(prime2.size()-1);
        System.out.println(max+" "+min);
        System.out.println(prime2.size());
        System.out.println(pf.fibonacci(min, max, prime2.size()-2));
       
    }
}