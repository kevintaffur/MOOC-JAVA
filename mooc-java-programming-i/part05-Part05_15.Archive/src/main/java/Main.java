
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> list = new ArrayList<>(); 
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Archive archive = new Archive(identifier, name);
            if (!(list.contains(archive))) {
                list.add(archive);
            }
        }
        for (Archive archive : list) {
            System.out.println(archive);
        }
    }
}
