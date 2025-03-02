import java.util.Scanner;

public class CapitalTheFirstLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = scan.nextLine();

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words){
            if(word.length() > 0){

                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}