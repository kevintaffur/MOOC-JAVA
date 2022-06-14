
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("end")) {
                break;
            }
            int n = Integer.valueOf(data);
            System.out.println(n * n * n);
        }
    }
}
