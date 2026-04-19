import java.util.Scanner;
public class p35 {
    public static void main(String[]args){
        //number pyramid pattern
        int n;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
