
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            sum = sum + number;

            if (number == 0) {
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }
    }
}
