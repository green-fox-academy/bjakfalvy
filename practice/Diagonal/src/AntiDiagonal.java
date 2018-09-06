public class AntiDiagonal {

    /**
     * Create and test a method called `getAntiDiagonalAvg` that takes a multidimensional array (only integers)
     * which represents a square matrix, as a parameter and returns the average of the numbers in the anti diagonal.
     * - write test for 2 different scenarios
     * <p>
     * Example cases:
     * [
     * [1, 2, 3],
     * [3, 4, 6],
     * [5, 2, 5]
     * ]
     * Should return 4, because (3 + 4 + 5) / 3 = 4.
     * <p>
     * [
     * [3, 5, 11, -2],
     * [3, 1, 7, 4],
     * [5, 0, 2, 9],
     * [21, 7, 8, 2]
     * ]
     * Should return 6.5, because (-2 + 7 + 0 + 21) / 4 = 6.5.
     */

    public static void main(String[] args) {
        int[][] firstMatrix = new int[3][3];
        firstMatrix[0][0] = 1;
        firstMatrix[0][1] = 2;
        firstMatrix[0][2] = 3;
        firstMatrix[1][0] = 3;
        firstMatrix[1][1] = 4;
        firstMatrix[1][2] = 6;
        firstMatrix[2][0] = 5;
        firstMatrix[2][1] = 2;
        firstMatrix[2][2] = 5;

        System.out.println(getAntiDiagonalAvg(firstMatrix));

        int [][] secondMatrix = new int[4][4];
        secondMatrix[0][0] = 3;
        secondMatrix[0][1] = 5;
        secondMatrix[0][2] = 11;
        secondMatrix[0][3] = -2;
        secondMatrix[1][0] = 3;
        secondMatrix[1][1] = 1;
        secondMatrix[1][2] = 7;
        secondMatrix[1][3] = 4;
        secondMatrix[2][0] = 5;
        secondMatrix[2][1] = 0;
        secondMatrix[2][2] = 2;
        secondMatrix[2][3] = 9;
        secondMatrix[3][0] = 21;
        secondMatrix[3][1] = 7;
        secondMatrix[3][2] = 8;
        secondMatrix[3][3] = 2;

        System.out.println(getAntiDiagonalAvg(secondMatrix));
    }

    public static double getAntiDiagonalAvg(int[][] numbers) {
        double avg = 0.0;
        int divideBy = numbers.length;
        double sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers.length; col++) {
                if ((row + col) == (numbers.length - 1)) {
                    System.out.println("Right Diagonal element is " + numbers[row][col]);
                    sum = sum + numbers[row][col];
                }
            }
        }
        avg = sum / divideBy;
        return avg;
    }
}