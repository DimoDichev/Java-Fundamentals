import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double totalSpendMoney = 0;
        boolean outOfMoney = false;

        while (!"Game Time".equals(command)) {
            double currentSpendMoney = 0;
            boolean notFound = false;

            switch (command) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    currentSpendMoney = 39.99;
                    break;
                case "CS: OG":
                    currentSpendMoney = 15.99;
                    break;
                case "Zplinter Zell":
                    currentSpendMoney = 19.99;
                    break;
                case "Honored 2":
                    currentSpendMoney = 59.99;
                    break;
                case "RoverWatch":
                    currentSpendMoney = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    notFound = true;
                    break;
            }

            if (currentBalance >= currentSpendMoney && !notFound) {
                totalSpendMoney += currentSpendMoney;
                currentBalance -= currentSpendMoney;
                System.out.printf("Bought %s%n", command);
            } else if (currentBalance < currentSpendMoney && !notFound) {
                System.out.println("Too Expensive");
            }


            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                outOfMoney = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (!outOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpendMoney, currentBalance);
        }
    }
}
