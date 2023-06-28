import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        double bestValue = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            double currentValue = Math.pow ((snow * 1.0 / time), quality);

            if (currentValue > bestValue) {
                bestSnow = snow;
                bestTime = time;
                bestQuality = quality;
                bestValue = currentValue;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
