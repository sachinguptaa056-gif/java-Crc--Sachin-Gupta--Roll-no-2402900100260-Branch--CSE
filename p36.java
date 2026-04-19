import java.util.Scanner;
public class p36 {
    public static void main(String[]args)
    {
       // sum of array and avg of array elements
        int n,sum=0;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (double)sum/n;
        System.out.println("sum of array elements: "+sum);
        System.out.println("average of array elements: "+avg);
        sc.close();

    }
}
