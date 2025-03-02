import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Sentence : ");
        String string = scan.nextLine();

        String[] words= string.split(" ");

        StringBuilder build = new StringBuilder();

        for (int i = 0; i < words.length ; i++) {
            StringBuilder reverse = new StringBuilder(words[i]).reverse();
            build.append(reverse);

            if(i < words.length){
                build.append(" ");
            }
        }
        System.out.println(build);
    }
}