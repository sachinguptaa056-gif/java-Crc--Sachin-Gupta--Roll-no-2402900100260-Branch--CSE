import java.util.Scanner;

class p64 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int count;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count = 1;

            if (ch == ' ') {
                continue;
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            // check if already counted
            boolean already = false;
            for (int k = 0; k < i; k++) {
                if (ch == str.charAt(k)) {
                    already = true;
                }
            }

            if (!already) {
                System.out.println(ch + " = " + count);
            }
        }
    }
}