
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

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
            
            if (option.equals("quit")) {
                break;
            } else if (option.equals("add")) {
                first.add(amount);
            } else if (option.equals("move")) {
                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
            } else if (option.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
