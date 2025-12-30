import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String original = str;
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("It is a Palindrome string");
        } else {
            System.out.println("It is not a Palindrome string");
        }

        sc.close();
    }
}
