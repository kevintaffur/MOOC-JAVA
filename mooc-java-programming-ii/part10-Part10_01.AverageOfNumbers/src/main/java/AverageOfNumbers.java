
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop");
        while (true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            numbers.add(number);
        }
        double average = numbers.stream()
                .mapToInt(value -> Integer.valueOf(value))
                .average()
                .getAsDouble();
        System.out.println("average of numbers: " + average);
    }
}
