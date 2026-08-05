import java.util.*;

public class MaxMinMatrix{
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

        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if( arr[i][j] > max){
                    max = arr[i][j];
                }
                if( arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);

        scan.close();
    }
}