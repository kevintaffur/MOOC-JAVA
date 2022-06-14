
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    public static int sum(int[] arr, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        if (toWhere > arr.length) {
            toWhere = arr.length;
        }
        for (int i = fromWhere; i < toWhere; i++) {
            if (arr[i] >= smallest && arr[i] <= largest) {
                sum += arr[i];
            }
        }
        return sum;
    }

}
