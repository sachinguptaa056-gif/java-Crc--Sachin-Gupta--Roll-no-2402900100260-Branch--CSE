import java.util.Scanner;

class p61 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String lower = "";
        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                lower = lower + (char)(ch + 32);
            } else {
                lower = lower + ch;
            }

            // lowercase to uppercase
            if (ch >= 'a' && ch <= 'z') {
                upper = upper + (char)(ch - 32);
            } else {
                upper = upper + ch;
            }
        }

        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
    }
}