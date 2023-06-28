import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokedCount = 0;
        int originalPokeMonPower = pokePower;

        while (pokePower >= distance) {
            pokedCount++;
            pokePower -= distance;
            if (pokePower == originalPokeMonPower / 2.0 && exhaustionFactor > 0) {
                pokePower = pokePower / exhaustionFactor;
            }
        }

        System.out.println(pokePower);
        System.out.println(pokedCount);
    }
}
