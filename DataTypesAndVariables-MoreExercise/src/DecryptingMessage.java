import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lineCount = Integer.parseInt(scanner.nextLine());

        String output = "";

        for (int i = 0; i < lineCount; i++) {
            char symbol = scanner.nextLine().charAt(0);
            char decryptedSymbol = (char) (symbol + key);
            output += decryptedSymbol;
        }

        System.out.println(output);
    }
}
