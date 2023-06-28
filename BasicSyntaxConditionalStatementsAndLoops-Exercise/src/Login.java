import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        StringBuilder password = new StringBuilder();
        password.append(username).reverse();

        boolean successfullyLogin = false;
        int loginTry = 0;

        while (!successfullyLogin) {
            String loginInput = scanner.nextLine();
            if (password.toString().equals(loginInput)) {
                successfullyLogin = true;
                System.out.printf("User %s logged in.", username);
            } else {
                loginTry++;
                if (loginTry == 4) {
                    System.out.printf("User %s blocked!", username);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
