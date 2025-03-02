import java.util.Scanner;

public class ReverseChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String letters = scanner.nextLine();

        String result = "";
        for (int i = letters.length()-1; i >= 0 ; i--) {
            result += letters.charAt(i);
        }
        System.out.println("The Reversed Letters : "+result);
    }
}