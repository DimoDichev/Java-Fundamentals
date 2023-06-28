import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;

        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                totalPrice += headsetPrice;
            }
            if (i % 3 == 0) {
                totalPrice += mousePrice;
            }
            if (i % 6 == 0) {
                totalPrice += keyboardPrice;
            }
            if (i % 12 == 0) {
                totalPrice += displayPrice;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
