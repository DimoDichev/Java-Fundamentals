import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = Integer.parseInt(scanner.nextLine());

        int bracketsCounter = 0;
        boolean nested = false;

        for (int i = 0; i < lineCount; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                if (bracketsCounter > 0) {
                    nested = true;
                    break;
                }
                bracketsCounter++;
            } else if (input.equals(")")) {
                if (bracketsCounter <= 0) {
                    nested = true;
                    break;
                }
                bracketsCounter--;
            }
        }

        if (nested || bracketsCounter != 0) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
