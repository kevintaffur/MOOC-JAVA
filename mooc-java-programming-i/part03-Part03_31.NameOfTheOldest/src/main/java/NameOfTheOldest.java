
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
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
                    oldestName = dataArr[i - 1];
                }
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
