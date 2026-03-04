import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String original = sc.nextLine();

        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed String: " + reversed);

        // Check palindrome
        if (original.equals(reversed)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }

        // Show original string
        System.out.println("Original String: " + original);

        // Demonstrate immutability
        String modified = original.concat(" Immutable");
        System.out.println("Modified String: " + modified);

        sc.close();
    }
}