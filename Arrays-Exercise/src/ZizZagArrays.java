import java.util.Arrays;
import java.util.Scanner;

public class ZizZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 1; i <= n; i++) {
            int[] currentArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0) {
                secondArr[i - 1] = currentArr[0];
                firstArr[i - 1] = currentArr[1];
            } else {
                firstArr[i - 1] = currentArr[0];
                secondArr[i - 1] = currentArr[1];
            }
        }

        for (int num : firstArr) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int num : secondArr) {
            System.out.print(num + " ");
        }
    }
}
