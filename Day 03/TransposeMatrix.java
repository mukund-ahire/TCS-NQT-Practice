import java.util.*;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();

        int arr[][] = new int[rows][cols];
        int transpose[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
                transpose[j][i] = arr[i][j];
            }
        }
        
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
        
        scan.close();
    }
}
