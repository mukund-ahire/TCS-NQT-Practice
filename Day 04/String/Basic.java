import java.util.*;

public class Basic {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        String s = "PROGRAM";
        int len = s.length();
        char ch = s.charAt(4);

        System.out.println(len);
        System.out.println(ch);

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+ " ");
        }

        // String lower = s.toLowerCase();
        // String upper = s.toUpperCase();
        // String sub = s.substring(ch);
        // boolean equal = s.equals(sub);


    }
}
