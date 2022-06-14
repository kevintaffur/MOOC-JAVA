
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String string = scanner.nextLine();

        System.out.print(string + string + string);

    }
}
