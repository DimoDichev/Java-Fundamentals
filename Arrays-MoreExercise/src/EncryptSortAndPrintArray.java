import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());

        int[] result = new int[inputCount];

        for (int i = 0; i < inputCount; i++) {
            String input = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                switch (symbol) {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        sum = sum + (symbol * input.length());
                        break;
                    default:
                        sum = sum + (symbol / input.length());
                        break;
                }
            }
            result[i] = sum;
        }

        Arrays.sort(result);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
