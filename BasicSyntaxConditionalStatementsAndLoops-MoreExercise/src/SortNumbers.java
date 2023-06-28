import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        List<Integer> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        Collections.sort(arr);
        Collections.reverse(arr);

        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
