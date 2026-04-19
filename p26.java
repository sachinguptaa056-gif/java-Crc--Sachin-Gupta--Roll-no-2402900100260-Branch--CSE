import java.util.Scanner;
public class p26 {
    public static void main(String[] args) {
        int n,d,rev=0,temp;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        temp = n;
        while(n>0)
        {d=n%10;
         rev=rev*10+d;
        n=n/10;}
    System.out.println("reverse of the number is: " + rev);
}
}
