
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int nn = 0;
        int number = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            
            if (number > 0) {
                sum = sum + number;
                nn = nn + 1;
            }
            
            if (nn == 0) {
                System.out.println("Cannot calculate the average");
            }

            if (number == 0) {
                double avg = (double) sum / nn;
                System.out.println(avg);
                break;
            }
        }
    }
}
