import java.util.*;

public class largestSmallest{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];


        for(int i=0 ; i<n ; i++){
            arr[i] = scan.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for( int i=1; i<n; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(smallest);

        scan.close();
    }
}
