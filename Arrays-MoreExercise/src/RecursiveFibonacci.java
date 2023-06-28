import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int num = 1;
        int previewNum = 0;

        for (int i = 1; i < count; i++) {
            num = num + previewNum;
            previewNum = num - previewNum;
        }

        System.out.println(num);
    }
}
