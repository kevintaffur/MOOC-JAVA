
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] arr) {
        StringBuilder strBuild = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                strBuild.append(arr[i][j]);
            }
            strBuild.append("\n");
        }
        return strBuild.toString();
    }

}
