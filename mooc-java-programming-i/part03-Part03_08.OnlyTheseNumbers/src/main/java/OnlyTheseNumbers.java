
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int from = 0;
        int to = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("From where?");
                from = Integer.valueOf(scanner.nextLine());
                System.out.println("To where?");
                to = Integer.valueOf(scanner.nextLine());
                break;
            }

            numbers.add(number);
        }
        for (int i = from; i <= to; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
