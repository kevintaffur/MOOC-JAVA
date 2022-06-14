
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longestNameLength = 0;
        // birth years average.
        int sum = 0;
        int iterations = 0;
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }
            String[] dataArr = data.split(",");
            int size = dataArr.length;
            for (int i = 1; i <= size; i += 2) {
                int nameLength = Integer.valueOf(dataArr[i - 1].length());
                if (nameLength > longestNameLength) {
                    longestNameLength = nameLength;
                    longestName = dataArr[i - 1];
                }
                sum += Integer.valueOf(dataArr[i]);
            }
            iterations += 1;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) sum / iterations));
    }
}
