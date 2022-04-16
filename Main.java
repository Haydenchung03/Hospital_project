import java.util.*;
import java.io.*;

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

                if (username.equals("ROAHayden") && password.equals("THISISATEST")) {
                    System.out.println("Hello Doctor! What do you want to do?");
                } else {
                    File file = new File("PatientLogin.txt");
                }
            } else if (option.equalsIgnoreCase("CREATE ACCOUNT")) {

                System.out.println("Enter in a username");
                String newUsername = scan.nextLine();
                System.out.println("Enter in a password");
                String newPassword = scan.nextLine();
                System.out.println("Re-enter password");
                String rePassword = scan.nextLine();
                try {
                    BufferedWriter userInfo;
                    userInfo = new BufferedWriter(new FileWriter(new File("PatientLogin.txt"), true));
                    userInfo.write("\n" + newUsername + ":" + rePassword);
                    userInfo.close();
                } catch (FileNotFoundException e) {
                    System.out.println("File not found!");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (option.equalsIgnoreCase("Quit")) {
                System.out.println("Thank you for using our program! Thank you!");
                break;
            }
        }
        scan.close();
    }
}
