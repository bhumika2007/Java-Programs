import java.util.Scanner;
import java.util.Arrays;
public class MinimumNotes
{public static void main(String args[])
{ Scanner scanner=new Scanner(System.in);
System.out.println("Enter the amount: ");
int amount=scanner.nextInt();
int[]denominations={1000,500,200,100,50,20,10,5,2,1};
Arrays.sort(denominations);
System.out.println("Minimum number of notes: ");
for(int i= denominations.length-1; i >= 0 ; i--)
{
    if (amount >= denominations[i]) {
        int count = amount / denominations[i];
        System.out.println(denominations[i]+":"+count);
        amount %= denominations[i];
    }

    }
    scanner.close();
}

}
