import java.util.Scanner;

public class PasswordVerifierApplication {



    public static void main(String[] args) {
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        Scanner scanner = new Scanner(System.in);
        Boolean result;

        System.out.println("--- password verifier ---");
        System.out.println("Enter a password: ");
        String password = scanner.nextLine();
        result = passwordVerifier.verify(password);
        if (result.equals(true)) {
            System.out.println("OK");
        } else {
            System.out.println("INVALID");
        }
    }
}
