package HashMap;
import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
             map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int key : map.keySet()){
            if (map.get(key) > 1) {
                System.out.print(key+ " ");
            }
        }

        scan.close();
    }
}
