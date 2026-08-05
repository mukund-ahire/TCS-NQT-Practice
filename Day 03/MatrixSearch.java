import java.util.*;

public class MatrixSearch {
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

        int target = scan.nextInt();

        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Found at Row = " + i);
                    System.out.println("Found at Column = " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if(!found){
            System.out.println("Not Found");
        }

        scan.close();
    }
}
