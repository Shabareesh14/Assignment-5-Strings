import java.util.Scanner;

public class EmailValidate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Email Validation Program : ");
        System.out.println("---------------------------");

        boolean continueValidate = true;

        while (continueValidate){
            System.out.println("Enter a Email to Validate (or 'exit' to quit): ");
            String userEmail = scanner.nextLine().trim();

            if (userEmail.equalsIgnoreCase("exit")){
                continueValidate = false;
                continue;
            }


            boolean isValid = isValidEmail(userEmail);
            System.out.println(userEmail+ " : is" +(isValid ? "Valid " : " inValid "));
        }

        System.out.println("Program Terminated. Good Bye! ");
    }

    public static boolean isValidEmail(String email){

        if(email == null || email.isEmpty()){
            return false;
        }

        int atIndex = email.indexOf('@');
        if(atIndex <= 0 || atIndex == email.length()-1){ // Intha Symbol First Aprm Last la ilama iruka '@'
            return false;
        }

        if(email.lastIndexOf('@') != atIndex){
            return false;
        }

//        String localPart = email.substring(0,atIndex);
        String domainPart = email.substring(atIndex+1);


        for (int i = 0; i < domainPart.length()-1; i++) {
            if (domainPart.charAt(i) == '.' && domainPart.charAt(i+1) == '.'){
                return false;
            }
        }
        return true;
    }
}