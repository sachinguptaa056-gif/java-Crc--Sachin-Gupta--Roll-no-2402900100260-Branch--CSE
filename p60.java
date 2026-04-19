import java.util.Scanner;

class p60 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int v = 0, c = 0, d = 0, s = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // check digit
            if (ch >= '0' && ch <= '9') {
                d++;
            }
            // check space
            else if (ch == ' ') {
                s++;
            }
            // check alphabets
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                    v++;
                } else {
                    c++;
                }
            }
        }

        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
        System.out.println("Digits = " + d);
        System.out.println("Spaces = " + s);
    }
}