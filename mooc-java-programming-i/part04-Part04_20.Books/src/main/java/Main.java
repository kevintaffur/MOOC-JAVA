import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>(); 
        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            list.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String data = scanner.nextLine();
        if (data.equals("everything")) {
            for (Book book : list) {
                System.out.println(book);
            }
        } else if (data.equals("name")) {
            for (Book book : list) {
                System.out.println(book.getTitle());
            }
        }

    }
}
