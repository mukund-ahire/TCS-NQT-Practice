import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

        scan.close();
    }
}
