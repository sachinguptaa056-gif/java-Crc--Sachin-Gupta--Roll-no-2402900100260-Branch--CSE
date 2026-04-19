import java.util.Scanner;
public class p19 {
    public static void main(String[]args)
    {
        int fact=1;
        int a;
        System.out.println("enter the value of a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial of " + a + " is " + fact);
        sc.close();
    }
}
