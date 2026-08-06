import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(char key : map.keySet()){
            System.out.println(key+ " -> "+map.get(key));
        }

        scan.close();
    }
}
