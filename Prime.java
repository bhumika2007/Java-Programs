import java.util.Scanner;
  class Prime
{
    public static void main(String[] args)
    {
        int n,i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to Check: ");
        n=sc.nextInt();
        i=1;//inilization 
        while(i<=n) {
        if(n%i==0)
        count=count+i;
        i=i+1;
        } 
        if(count==2)
        System.out.println("Prime");
        else
        System.out.println("Non Prime");
        
    }
}