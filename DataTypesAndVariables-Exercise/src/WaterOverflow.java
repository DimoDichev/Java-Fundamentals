import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int waterTank = 0;

        for (int i = 0; i < n; i++) {
            int waterQuantities = Integer.parseInt(scanner.nextLine());

            if (waterTank + waterQuantities > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                waterTank += waterQuantities;
            }
        }
        System.out.println(waterTank);
    }
}
