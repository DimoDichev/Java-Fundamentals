import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        boolean ifIsSpecial = false;

        for (int i = 1; i <= count; i++) {
            int currentNum = i;
            int sum = 0;

            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }

            ifIsSpecial = (sum == 5) || (sum == 7) || (sum == 11);

            if (ifIsSpecial) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
