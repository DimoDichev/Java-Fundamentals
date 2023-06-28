import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int specialNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int nextNum = arr[j];
                if (currentNum + nextNum == specialNum) {
                    System.out.printf("%d %d%n", currentNum, nextNum);
                }
            }
        }
    }
}
