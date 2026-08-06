import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        
        int left = 0;
        int right = s.length()-1;

        boolean palindrome = true;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                palindrome = false;
                break;
            }
            left ++;
            right --;
        }

        if(palindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        scan.close();
    }
}
