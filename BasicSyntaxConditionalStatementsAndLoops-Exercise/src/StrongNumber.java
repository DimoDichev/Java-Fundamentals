import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int numForImplementation = num;
        int sum = 0;

        while (numForImplementation > 0) {
            int currentNum = numForImplementation % 10;
            sum = sum + calculateFactorial(currentNum);

            numForImplementation = numForImplementation / 10;
        }

        if (num == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static int calculateFactorial(int num) {
        int sum = 1;

        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }

        return sum;
    }
}
