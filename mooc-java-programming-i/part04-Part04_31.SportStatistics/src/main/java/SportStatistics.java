
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<String> list = csvToList(file);
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        if (list.contains(team)) {
            for (int i = 0; i < list.size(); i += 4) {
                if (list.get(i).equals(team)) {
                    games += 1;
                    if (Integer.valueOf(list.get(i + 2)) < Integer.valueOf(list.get(i + 3))) {
                        losses += 1;
                    } else {
                        wins += 1;
                    }
                }
                if (list.get(i + 1).equals(team)) {
                    games += 1;
                    if (Integer.valueOf(list.get(i + 2)) < Integer.valueOf(list.get(i + 3))) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                }
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<String> csvToList(String file) {
        ArrayList<String> list = new ArrayList<>(); 
        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] lineArr = line.split(",");
                String team1 = lineArr[0];
                String team2 = lineArr[1];
                String points1 = lineArr[2];
                String points2 = lineArr[3];
                list.add(team1);
                list.add(team2);
                list.add(points1);
                list.add(points2);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }

}
