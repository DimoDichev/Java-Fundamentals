import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int result = 0;

        for (int i = 0; i < n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            result += symbol;
        }

        System.out.printf("The sum equals: %d", result);
    }
}
