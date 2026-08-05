import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        int target = scan.nextInt();
        
        
        // for (int i = 0; i < arr.length; i++) {
        //     int key = arr[i];
        //     int j = i-1;
        //     while(j>=0 && arr[j]>key){
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        //     arr[j+1]=key;    
        // }

        int low = 0;
        int high = n-1;
        int index = -1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(target == arr[mid]){
                index = mid;
                break;
            }
            if(target>arr[mid]){
                low = mid + 1;
            }
            if(target<arr[mid]){
                high = mid - 1;
            }
        }

        System.out.println(index);

        scan.close();
    }
}