package HashMap;
import java.util.*;

public class DupQue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                System.out.println("Duplicate found : " + arr[i]);
            }else{
                map.put(arr[i],1);

            }
        }
        scan.close();
    }
}
