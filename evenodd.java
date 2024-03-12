import java.util.Scanner;
class evenodd 
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);;
     System.out.println("Enter the number to check=");
     n=sc.nextInt();
     if(n%2==0)
     System.out.println("number is even");
     else
     System.out.println("number is odd");
    }

} 