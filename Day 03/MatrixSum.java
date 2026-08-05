import java.util.*;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();

        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // Only Sum
        // int sum = 0;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         sum = sum + arr[i][j];
        //     } 
        // }
        // System.out.println(sum);


        //Row Sum
        // for (int i = 0; i < rows; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < cols; j++) {
        //         sum = sum + arr[i][j];
        //     }
        //     System.out.println(sum);
        // }

        //Column Sum
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }

        scan.close();
    }
}