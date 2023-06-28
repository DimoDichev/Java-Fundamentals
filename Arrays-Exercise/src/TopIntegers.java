import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];

            if (i == arr.length - 1) {
                System.out.print(currentNum);
                break;
            }

            boolean isBiggerThanAll = true;

            for (int j = i + 1; j < arr.length; j++) {
                int nextNum = arr[j];
                if (nextNum >= currentNum) {
                    isBiggerThanAll = false;
                    break;
                }
            }

            if (isBiggerThanAll) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
