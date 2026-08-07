import java.util.HashSet;
import java.util.Scanner;

public class DuplicateFound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(!set.add(arr[i])){
                System.out.println("Duplicate Found : "+arr[i]);
                break;
            }
        }

        scan.close();
    }
}
