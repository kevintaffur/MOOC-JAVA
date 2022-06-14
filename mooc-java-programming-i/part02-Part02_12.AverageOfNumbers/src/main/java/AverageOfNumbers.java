
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 0;
        // number of numbers.
        int nn = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            sum = sum + number;
            nn = nn + 1;
            if (number == 0) {
                double avg = (double) sum / (nn - 1);
                System.out.println("Average of the numbers: " + avg);
                break;
            }
        }
    }
}
