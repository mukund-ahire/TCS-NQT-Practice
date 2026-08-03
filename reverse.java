import java.util.*;

public class reverse{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n ; i++){
            arr[i]=scan.nextInt();
        }

        // int rev_arr[]=new int[n];

        // for(int i=0; i<n; i++){
        //     rev_arr[i]=arr[n-i-1];
        // }

        // for(int i= 0; i<n; i++){
        //     System.out.print(rev_arr[i]+" ");
        // }

        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        
        scan.close();
    }
}