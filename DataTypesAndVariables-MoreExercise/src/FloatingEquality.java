import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        double eps = 0.000001;

        boolean isEquals = Math.abs(firstNum - secondNum) < eps;

        if (isEquals) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
