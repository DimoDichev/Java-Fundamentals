import java.util.Scanner;

public class RecursiveFibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int result = getFibonacci(num);

        System.out.println(result);
    }

    private static int getFibonacci(int num) {
        if (num <= 1) {
            return num;
        }

        return getFibonacci(num - 1) + getFibonacci(num - 2);
    }
}
