
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(5));

        MagicSquare square = new MagicSquare(2);

        square.placeValue(0, 0, 1);
        square.placeValue(0, 1, 1);
        square.placeValue(1, 0, 5);
        square.placeValue(1, 1, 7);

        square.sumsOfDiagonals();
    }
}
