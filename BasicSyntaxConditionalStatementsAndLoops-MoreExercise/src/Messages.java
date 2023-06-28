import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputCount; i++) {
            String input = scanner.nextLine();

            int numberLength = Integer.parseInt(String.valueOf(input.length()));
            int mainDigit = Integer.parseInt(String.valueOf(input.charAt(0)));
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 0) {
                System.out.print(" ");
                continue;
            }

            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            int letterIndex = offset + numberLength - 1;
            char currentSymbol = (char) (letterIndex + 97);

            System.out.print(currentSymbol);
        }
    }
}
