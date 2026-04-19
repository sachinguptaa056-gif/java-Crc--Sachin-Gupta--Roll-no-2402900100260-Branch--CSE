import java.util.Scanner;
public class p20 {
 public static void main(String[]args )
    {
        int n;
        int a=0;
        int b=1;
        int c;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
