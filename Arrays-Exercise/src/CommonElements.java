import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split("\\s+");
        String[] secondArr = scanner.nextLine().split("\\s+");

        for (int i = 0; i < secondArr.length; i++) {
            String currentWord = secondArr[i];

            for (int j = 0; j < firstArr.length; j++) {
                if (currentWord.equals(firstArr[j])) {
                    System.out.print(currentWord + " ");
                }
            }
        }
    }
}
