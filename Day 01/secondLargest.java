import java.util.*;

public class secondLargest{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = scan.nextInt();
        }

        int second_largest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i]!=largest){
                second_largest = arr[i];
            }
        }   

        System.out.println(second_largest);

        scan.close();
    }
}
