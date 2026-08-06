import java.util.*;

public class CountVandC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int vowels = 0;
        int consonants = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels += 1;
            }else{
                consonants += 1;
            }
        }

        System.out.println(vowels);
        System.out.println(consonants);

        scan.close();
    }
}
