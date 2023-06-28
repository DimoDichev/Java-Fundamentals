import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        
        int startIndex = 0;
        int bestStartIndex = 0;
        int length = 1;
        int bestLength = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                length++;
            } else {
                startIndex = i;
                length = 1;
            }

            if (length > bestLength) {
                bestLength = length;
                bestStartIndex = startIndex;
            }
        }

        if (arr.length == 1 || (bestStartIndex == 1 && length == 1)) {
            System.out.println(arr[0]);
        } else {
            for (int i = bestStartIndex; i < bestStartIndex + bestLength; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
