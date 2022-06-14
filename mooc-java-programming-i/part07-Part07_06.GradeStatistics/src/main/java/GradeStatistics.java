import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> grades;

    public GradeStatistics() {
        this.grades = new ArrayList<>();
    }

    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        }
    }

    public double pointAverage() {
        int sum = 0;
        for (Integer integer : this.grades) {
            sum += integer;
        }
        return sum / this.grades.size();
    }

    public double pointAveragePassing() {
        int sum = 0;
        int count = 0;
        for (Integer integer : this.grades) {
            if (integer > 50) {
                sum += integer;
                count += 1;
            }
        }
        return sum / count;
    }

    public double passPercentage() {
        int passing = 0;
        for (Integer integer : this.grades) {
            if (integer >= 50) {
                passing += 1;
            }
        }
        return (100.0 * passing) / this.grades.size();
    }

    public void gradeDistribution() {
        int lessThan50 = 0;
        int lessThan60 = 0;
        int lessThan70 = 0;
        int lessThan80 = 0;
        int lessThan90 = 0;
        int ninetyOrMore = 0;

        for (Integer integer : this.grades) {
            if (integer < 50) {
                lessThan50 += 1;
            } else if (integer < 60) {
                lessThan60 += 1;
            } else if (integer < 70) {
                lessThan70 += 1;
            } else if (integer < 80) {
                lessThan80 += 1;
            } else if (integer < 90) {
                lessThan90 += 1;
            } else if (integer >= 90) {
                ninetyOrMore += 1;
            }
        }
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        printStars(ninetyOrMore);
        System.out.print("4: ");
        printStars(lessThan90);
        System.out.print("3: ");
        printStars(lessThan80);
        System.out.print("2: ");
        printStars(lessThan70);
        System.out.print("1: ");
        printStars(lessThan60);
        System.out.print("0: ");
        printStars(lessThan50);
    }

    public void printStars(int max) {
        for (int i = 0; i < max; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
