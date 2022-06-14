
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String[] line = read.nextLine().split(",");
                String name = line[0];
                int age = Integer.valueOf(line[1]);
                System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
