package HashMap;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(10,1);
        map.put(20, 2);
        map.put(30, 5);

        map.put(10, 6);

        // System.out.println(map.get(10));

        if(map.containsKey(10)){
            System.out.println("Exists");
        }

        scan.close();

    }
}