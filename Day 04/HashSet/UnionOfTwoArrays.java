import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set);

        scan.close();
    }    
}
