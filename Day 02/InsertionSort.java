import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int current_key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current_key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current_key;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}