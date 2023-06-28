import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i < numberCount * 2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
