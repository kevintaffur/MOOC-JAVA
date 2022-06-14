
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1 = Integer.valueOf(scanner.nextLine());
        double number2 = Integer.valueOf(scanner.nextLine());
        double sum = number1 + number2;
        double sqrR = Math.sqrt(sum);
        System.out.println(sqrR);
    }
}
