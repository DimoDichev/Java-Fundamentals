import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int result = 0;

        while (num > 0) {
            int digit = num % 10;
            result += digit;

            num = num / 10;
        }

        System.out.println(result);
    }
}
