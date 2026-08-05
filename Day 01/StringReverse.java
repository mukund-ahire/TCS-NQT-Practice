import java.util.*;

public class StringReverse{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }

    }
}