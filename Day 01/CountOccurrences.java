import java.util.*;

public class CountOccurrences{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }

        int target = scan.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                count = count + 1;
            }
        }
        
        System.out.println(count);

        scan.close();
    }
}
