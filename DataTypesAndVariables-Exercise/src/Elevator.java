import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCourses = numberOfPeople / capacity;

        if (numberOfPeople % capacity != 0) {
            fullCourses++;
        }

        System.out.println(fullCourses);
    }
}
