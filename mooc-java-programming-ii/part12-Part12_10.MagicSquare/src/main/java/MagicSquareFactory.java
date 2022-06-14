
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int value = 1;
        int row = 0;
        int column = size / 2;
        int total = size * size;

        int rowNow;
        int columnNow;

        while (value <= total) {
            square.placeValue(row, column, value);
            value++;

            rowNow = row;
            columnNow = column;

            row -= 1;
            column += 1;

            if (row < 0) {
                row = size - 1;
            }

            if (column == size) {
                column = 0;
            }

            if (square.readValue(row, column) != 0) {
                row = rowNow + 1;
                column = columnNow;
                if (row < 0) {
                    row = size - 1;
                }
            }
        }
        return square;
    }
}
