import java.util.Scanner;
public class p34 {
    public static void main(String[]args)
    {
    //floyed triangle
    int n;
    System.out.println("enter the value of n");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    sc.close();
    
}
    }