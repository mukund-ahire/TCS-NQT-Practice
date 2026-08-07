import java.util.*;

public class Muttable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" DSA"); // This statement adds the String.
        System.out.println(sb);

        sb.reverse(); // This statement reverse the String
        System.out.println(sb);

        sb.length(); // length
        sb.charAt(0); // access character
        sb.setCharAt(0, 'Y'); // change character
        sb.deleteCharAt(0); // delete character

        scan.close();
    }
}
