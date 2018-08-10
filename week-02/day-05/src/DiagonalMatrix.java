import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args){
        int[][] matrix = new int[4][4];

        matrix [0][0] = 1;
        matrix [1][1] = 1;
        matrix [2][2] = 1;
        matrix [3][3] = 1;

       for (int i = 0; i < matrix.length; i++){
           System.out.println(Arrays.toString(matrix[i]));
       }
    }
}
