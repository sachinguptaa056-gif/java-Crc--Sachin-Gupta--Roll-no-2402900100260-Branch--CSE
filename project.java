import java.util.Scanner;

public class project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        char op;

        System.out.println("Enter first number: ");
        a = sc.nextInt();

        System.out.println("Enter operator (+ - * /): ");
        op = sc.next().charAt(0);

        System.out.println("Enter second number: ");
        b = sc.nextInt();

        int result = 0;

        if (op == '+') {
            result = a + b;
        } 
        else if (op == '-') {
            result = a - b;
        } 
        else if (op == '*') {
            result = a * b;
        } 
       
        else if (op == '/') {
             if(b==0)
        {
            System.out.println("devide by zero is not accepted");
            return;
        }
            result = a / b;
        } 

        else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result = " + result);
    }
}