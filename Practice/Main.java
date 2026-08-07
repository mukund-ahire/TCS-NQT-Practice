import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            if(!set.add(arr1[i])){
                System.out.println(arr1[i]);
                break;
            }
        }

        scan.close();

    }
}