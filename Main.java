import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter in a username: ");

        String username = scan.nextLine();

        System.out.println("Please enter in a password: ");
        String password = scan.nextLine();

        Login login = new Login(username, password);
        System.out.println(login.print());
        scan.close();
    }
}
