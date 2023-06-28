import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orderCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int i = 0; i < orderCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double price = (days * capsulesCount) * pricePerCapsule;
            totalPrice += price;

            System.out.printf("The price for the coffee is: $%.2f%n", price);
        }

        System.out.printf("Total: $%.2f", totalPrice);
    }
}
