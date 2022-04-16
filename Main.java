import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Main Menu");
            System.out.println("Login");
            System.out.println("Create Account");
            System.out.println("Quit");
            String option = scan.nextLine();
            if (option.equalsIgnoreCase("LOGIN")) {

                System.out.println("Please enter in a username: ");

                String username = scan.nextLine();

                System.out.println("Please enter in a password: ");
                String password = scan.nextLine();

                Login login = new Login(username, password);
                System.out.println(login.print());
            } else if (option.equalsIgnoreCase("CREATE ACCOUNT")) {
                System.out.println("Enter in a username");
                String newUsername = scan.nextLine();
                System.out.println("Enter in a password");
                String newPassword = scan.nextLine();
                System.out.println("Re-enter password");
                String rePassword = scan.nextLine();

            } else if (option.equalsIgnoreCase("Quit")) {
                System.out.println("Thank you for using our program! Thank you!");
                break;
            }
        }

        scan.close();
    }
}
