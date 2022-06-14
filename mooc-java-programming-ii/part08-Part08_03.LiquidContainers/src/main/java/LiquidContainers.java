
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] commands = input.split(" ");

            String option = "";
            int amount = 0;
            if (commands.length == 1) {
                option = input;
            } else {
                option = commands[0];
                amount = Integer.valueOf(commands[1]);
            }

            if (amount < 0) {
                continue;
            }

            if (option.equals("quit")) {
                break;
            } else if (option.equals("add")) {
                if (first + amount > 100) {
                    first = 100;
                } else {
                    first += amount;
                }
            } else if (option.equals("move")) {
                if (amount > first) {
                    second = first;
                    first = 0;
                } else if (amount + second > 100) {
                    second = 100;
                    first -= amount;
                } else {
                    second += amount;
                    first -= amount;
                }
            } else if (option.equals("remove")) {
                if (amount > second) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }
        }
    }

}
