import java.util.*;

public class ArraySum{
    public static void main (String ars[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        int sum = 0;

        for(int i=0 ; i<n ; i++){
            arr[i] = scan.nextInt();
            sum = sum + arr[i];
        }

        System.out.println(sum);

        scan.close();
    }
}