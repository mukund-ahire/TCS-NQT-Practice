import java.util.HashSet;
import java.util.Scanner;

public class CountUniqueElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n =scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set.size());

        scan.close();
    }
}
