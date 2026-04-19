import java.util.Scanner;

public class p27 {
    public static void main(String[]args)
    {
        int n,d,sum=0;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0)
        { d=n%10;
        n=n/10;
        sum=sum+d;
    } 
           System.out.println("sum of the digits is: " + sum);
    }
}
