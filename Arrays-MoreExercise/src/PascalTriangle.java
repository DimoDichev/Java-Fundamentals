import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int[] arr = {1};
        System.out.println(arr[0]);

        for (int i = 1; i < count; i++) {
            int[] nextLine = new int[arr.length + 1];
            for (int j = 0; j < nextLine.length; j++) {
                if (j == 0 || j == nextLine.length - 1) {
                    nextLine[j] = 1;
                } else {
                    nextLine[j] = arr[j - 1] + arr [j];
                }
            }

            arr = nextLine;
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
