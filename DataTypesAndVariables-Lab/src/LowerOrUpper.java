import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char symbol = input.charAt(0);

        if (symbol >= 97) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
