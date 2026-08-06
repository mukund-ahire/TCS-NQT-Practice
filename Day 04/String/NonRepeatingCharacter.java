import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==1){
                System.out.println(s.charAt(i));
                break;
            }
        }

        scan.close();
    }
}
