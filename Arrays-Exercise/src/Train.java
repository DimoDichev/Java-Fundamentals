import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());

        int peopleCount = 0;
        int[] wagons = new int[wagonsCount];

        for (int i = 0; i < wagonsCount; i++) {
            int currentWagon = Integer.parseInt(scanner.nextLine());
            peopleCount += currentWagon;
            wagons[i] = currentWagon;
        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(peopleCount);
    }
}
