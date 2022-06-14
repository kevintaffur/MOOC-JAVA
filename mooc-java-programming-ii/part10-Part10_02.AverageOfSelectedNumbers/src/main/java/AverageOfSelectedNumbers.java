
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }

            list.add(line);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        if (answer.equals("n")) {
            double average = list.stream()
                    .mapToInt(value -> Integer.valueOf(value))
                    .filter(value -> value < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else if (answer.equals("p")) {
            double average = list.stream()
                    .mapToInt(value -> Integer.valueOf(value))
                    .filter(value -> value > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
