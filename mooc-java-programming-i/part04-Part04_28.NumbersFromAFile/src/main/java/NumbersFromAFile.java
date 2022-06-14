
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                list.add(Integer.valueOf(read.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // number of numbers.
        int nn = 0;
        for (Integer integer : list) {
            if (integer >= lowerBound && integer <= upperBound) {
                nn += 1;
            }
        }
        System.out.println("Numbers: " + nn);
    }

}
