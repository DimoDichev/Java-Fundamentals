import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double sum = 0;

        while (!"Start".equals(command)) {
            double moneyInput = Double.parseDouble(command);

            if (moneyInput == 0.1 || moneyInput == 0.2 || moneyInput == 0.5 || moneyInput == 1 || moneyInput == 2) {
                sum += moneyInput;
            } else {
                System.out.printf("Cannot accept %.2f%n", moneyInput);
            }
            command = scanner.nextLine();
        }

        command = scanner.nextLine();

        while (!"End".equals(command)) {
            switch (command) {
                case "Nuts":
                    if (sum >= 2) {
                        System.out.println("Purchased Nuts");
                        sum -= 2;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        System.out.println("Purchased Water");
                        sum -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        System.out.println("Purchased Crisps");
                        sum -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        System.out.println("Purchased Soda");
                        sum -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1) {
                        System.out.println("Purchased Coke");
                        sum -= 1;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}
