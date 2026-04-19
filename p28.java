import java.util.Scanner;
public class p28 {
    public static void main(String[]args)
    {
         int l,h,a,b;
            System.out.println("enter the value of a and b");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            h = (a<b)?a:b;
            while(h>0)
            {
                if(a%h==0 && b%h==0)
                {
                    break;
                }
                h--;
            }
            l = (a*b)/h;
            System.out.println("hcf is: " + h);
            System.out.println("lcm is: " + l);
    }
}
