
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdsList birds = new BirdsList();
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String nameLatin = scan.nextLine();
                birds.add(new Bird(name, nameLatin));
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                birds.addObservation(bird);
            } else if (command.equals("All")) {
                birds.all();
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                System.out.println(birds.one(bird));
            } else if (command.equals("Quit")) {
                return;
            }
        }
    }
}
