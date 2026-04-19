import java.util.Scanner;

public class p24 {
    public static void main(String[]args)
    {
        int n,temp,d,sum=0;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;
        while(n>0)
        {
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
            
        }
        if(sum==temp){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        sc.close();
    }
}
