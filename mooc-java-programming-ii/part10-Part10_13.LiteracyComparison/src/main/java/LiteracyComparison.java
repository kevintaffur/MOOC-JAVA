
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .sorted((part1, part2) -> {
                        return Double.compare(Double.valueOf(part1[5].trim()), Double.valueOf(part2[5].trim()));
                    })
                    .forEach(parts -> System.out.println(parts[3] + " (" + parts[4] + "), " + parts[2].trim().replace(" (%)", "") + ", " + parts[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
