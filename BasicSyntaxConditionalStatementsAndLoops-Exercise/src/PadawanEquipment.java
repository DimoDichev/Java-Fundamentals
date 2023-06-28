import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightSabersPriceInput = Double.parseDouble(scanner.nextLine());
        double robesPriceInput = Double.parseDouble(scanner.nextLine());
        double beltsPriceInput = Double.parseDouble(scanner.nextLine());

        double lightSabersPrice = lightSabersPriceInput * (studentCount + Math.ceil(studentCount * 0.10));
        double robesPrice = studentCount * robesPriceInput;
        double beltsPrice = (studentCount - Math.floor(studentCount / 6.0)) * beltsPriceInput;

        double totalPrice = lightSabersPrice + robesPrice + beltsPrice;

        if (money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - money);
        }
    }
}
