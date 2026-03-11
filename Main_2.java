import java.util.Scanner;
import java.util.StringTokenizer;

// Type Content here...
public class Main_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence, " ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        sc.close();
    }
}