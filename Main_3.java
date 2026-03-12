import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            // Type your code here...
            int num = Integer.parseInt(input);

            if (num == 0 || num < 0) {
                throw new IllegalArgumentException();
            }

            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            System.out.println("Factorial: " + fact);

        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input");

        } catch (IllegalArgumentException e) {
            System.out.println("Only positive numbers are allowed");
        }
    }
}