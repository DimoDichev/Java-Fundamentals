import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int line = 0; line < n; line++) {
            String input = scanner.nextLine();

            String left = "";
            String right = "";
            boolean afterSpace = false;

            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);

                if (Character.isSpaceChar(symbol)) {
                    afterSpace = true;
                    continue;
                }

                if (!afterSpace) {
                    left += symbol;
                } else {
                    right += symbol;
                }
            }

            long leftNum = Long.parseLong(left);
            long rightNum = Long.parseLong(right);

            long biggerNum = Math.abs(Math.max(leftNum, rightNum));
            long sum = 0;

            while (biggerNum > 0) {
                long digit = biggerNum % 10;
                sum = sum + digit;
                biggerNum = biggerNum / 10;
            }

            System.out.println(sum);
        }
    }
}
