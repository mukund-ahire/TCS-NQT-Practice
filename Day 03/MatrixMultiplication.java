import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rowsA = scan.nextInt();
        int colsA = scan.nextInt();

        int arrA[][] = new int[rowsA][colsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                arrA[i][j] = scan.nextInt();
            }
        }

        int rowsB = scan.nextInt();    
        int colsB = scan.nextInt();
        
        int arrB[][] = new int[rowsB][colsB];
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                arrB[i][j] = scan.nextInt();
            }
        }
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible");
            scan.close();
            return;
        }

        int result[][] = new int[rowsA][colsB];

        if(colsA == rowsB){
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result[i][j] += arrA[i][k] * arrB[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
