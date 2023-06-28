import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            int currentNum = i;
            int currentSum = 0;

            while (currentNum > 0) {
                int digit = currentNum % 10;
                currentSum += digit;
                currentNum = currentNum / 10;
            }

            if (currentSum == 5 || currentSum == 7 || currentSum == 11) {
                System.out.println(i +  " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }
    }
}
