import java.util.*;

public class StringPalindrome{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int left = 0;
        int right = str.length() - 1;


        boolean isPalindrome = true;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome = false;
                break;
            }

            left ++;
            right --;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        scan.close();
    }
}