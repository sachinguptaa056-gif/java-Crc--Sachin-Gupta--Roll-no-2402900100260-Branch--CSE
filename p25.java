import java.util.Scanner;
public class p25 {
    public static void main(String[]args)
    {
        int n;
        int fact=1;
        int num,d,i;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        num=n;
     while(n>0)
     { 
        d=n%10;
        fact=1;
        for(i=1;i<=d;i++){
            fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
     }
     if(sum==num){
        System.out.println("strong number");
     }
     else{
        System.out.println("not strong number");
     }
     sc.close();
    }
}
