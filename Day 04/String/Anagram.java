import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            scan.close();
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if (map1.equals(map2)) {
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

        scan.close();
    }
}
