import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int left = 0; left < i; left++) {
                leftSum += arr[left];
            }
            for (int right = i + 1; right < arr.length; right++) {
                rightSum += arr[right];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("no");
        }
    }
}
