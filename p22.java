import java.util.Scanner;
public class p22 {
    public static void main(String[]args)
    {
        int n, rev=0,temp,digit;
        
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;
        while(n>0)
            
        {    digit=n%10;
            rev=rev*10+digit;
            n=n/10;
            
            
        }
        if(rev==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
}
}