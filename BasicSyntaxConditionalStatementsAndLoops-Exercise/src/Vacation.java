import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;

        if ("Students".equals(type)) {
            if ("Friday".equals(day)) {
                totalPrice = peopleCount * 8.45;
            } else if ("Saturday".equals(day)) {
                totalPrice = peopleCount * 9.80;
            } else if ("Sunday".equals(day)) {
                totalPrice = peopleCount * 10.46;
            }

            if (peopleCount >= 30) {
                totalPrice = totalPrice * 0.85;
            }
        } else if ("Business".equals(type)) {
            if (peopleCount >= 100) {
                peopleCount -= 10;
            }

            if ("Friday".equals(day)) {
                totalPrice = peopleCount * 10.90;
            } else if ("Saturday".equals(day)) {
                totalPrice = peopleCount * 15.60;
            } else if ("Sunday".equals(day)) {
                totalPrice = peopleCount * 16.00;
            }
        } else if ("Regular".equals(type)) {
            if ("Friday".equals(day)) {
                totalPrice = peopleCount * 15.00;
            } else if ("Saturday".equals(day)) {
                totalPrice = peopleCount * 20.00;
            } else if ("Sunday".equals(day)) {
                totalPrice = peopleCount * 22.50;
            }

            if (peopleCount >= 10 && peopleCount <= 20) {
                totalPrice = totalPrice * 0.95;
            }
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
