import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while(!"end".equals(command)) {
            String[] tokens = command.split("\\s+");
            String currentCommand = tokens[0];
            int firstIndex = 0;
            int secondIndex = 0;

            if (!"decrease".equals(currentCommand)) {
                firstIndex = Integer.parseInt(tokens[1]);
                secondIndex = Integer.parseInt(tokens[2]);
            }

            switch (currentCommand) {
                case "swap":
                    int firstIndexNum = arr[firstIndex];
                    arr[firstIndex] = arr[secondIndex];
                    arr[secondIndex] = firstIndexNum;
                    break;
                case "multiply":
                    arr[firstIndex] = arr[firstIndex] * arr[secondIndex];
                    break;
                case "decrease":
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = arr[i] - 1;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        String[] stringArr = new String[arr.length];
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = String.valueOf(arr[i]);
        }

        System.out.println(String.join(", ", stringArr));
    }
}
