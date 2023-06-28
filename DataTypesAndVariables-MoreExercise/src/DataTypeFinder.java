import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            if ("true".equalsIgnoreCase(command) || "false".equalsIgnoreCase(command)) {
                System.out.println(command + " is boolean type");
                command = scanner.nextLine();
                continue;
            }

            boolean isFloatingPoint = true;
            boolean isInteger = true;

            try {
                int num = Integer.parseInt(command);
            } catch (Exception e) {
                isInteger = false;
            }

            try {
                double num = Double.parseDouble(command);
            } catch (Exception e) {
                isFloatingPoint = false;
            }

            if (isInteger) {
                System.out.println(command + " is integer type");
            } else if (isFloatingPoint) {
                System.out.println(command + " is floating point type");
            } else if (command.length() == 1) {
                System.out.println(command + " is character type");
            } else {
                System.out.println(command + " is string type");
            }

            command = scanner.nextLine();
        }
    }
}
