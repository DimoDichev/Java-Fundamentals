import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int day = 0;
        int totalSpice = 0;

        while (yield >= 100) {
            totalSpice += yield - 26;
            day++;
            yield -= 10;
        }

        totalSpice = Math.max(0, totalSpice - 26);

        System.out.println(day);
        System.out.println(totalSpice);
    }
}
