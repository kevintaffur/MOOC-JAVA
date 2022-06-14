
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                if (sum == 0) {
                    System.out.println("Cannot calculate the average");
                    return;
                }
                System.out.println(Double.valueOf(sum) / count);
                return;
            }
            if (number < 0) {
                continue;
            }
            count++;
            sum += number;
        }
    }
}
