
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }
            String[] dataArr = data.split(",");
            int size = dataArr.length;
            for (int i = 1; i <= size; i += 2) {
                if (Integer.valueOf(dataArr[i]) > oldest) {
                    oldest = Integer.valueOf(dataArr[i]);
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
