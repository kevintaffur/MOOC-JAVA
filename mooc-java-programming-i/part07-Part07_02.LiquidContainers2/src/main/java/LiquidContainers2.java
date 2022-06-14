
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command;
            int amount = 0; 
            if (parts.length == 1) {
                command = input;
            } else {
                command = parts[0];
                amount = Integer.valueOf(parts[1]);
            }
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            } else if (command.equals("move")) {
                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(first.contains());
                } else if (amount + second.contains() > 100) {
                    second.add(100);
                    first.remove(amount);
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
            }
        }
    }
}
