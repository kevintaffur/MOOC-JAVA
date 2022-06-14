
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter total points, -1 stops:");
        GradeStatistics gradeStatistics = new GradeStatistics();

        while (true) {
            int points = Integer.valueOf(scanner.nextInt());

            if (points == -1) {
                System.out.println("Point average (all): " + gradeStatistics.pointAverage());
                System.out.println("Point average (passing): " + gradeStatistics.pointAveragePassing());
                System.out.println("Pass percentage: " + gradeStatistics.passPercentage());
                gradeStatistics.gradeDistribution();
                return;
            }
            gradeStatistics.add(points);
        }
    }
}
