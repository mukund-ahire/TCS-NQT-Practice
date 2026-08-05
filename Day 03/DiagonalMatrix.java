import java.util.*;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int mainSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    mainSum = mainSum + arr[i][j];
                }
                if(i+j == n-1){
                    secondarySum = secondarySum + arr[i][j];
                }
            }
        }

        System.out.println(mainSum);
        System.out.println(secondarySum);

        scan.close();
    }
}
