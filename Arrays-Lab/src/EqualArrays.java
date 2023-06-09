import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean notEqual = false;

        for (int i = 0; i < firstArr.length; i++) {
            sum += firstArr[i];
            if (firstArr[i] != secondArr[i]) {
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                notEqual = true;
                break;
            }
        }

        if (!notEqual) {
            System.out.println("Arrays are identical. Sum: " + sum);
        }
    }
}
