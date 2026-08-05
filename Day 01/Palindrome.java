import java.util.*;

public class Palindrome{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int original = n;
        int reverse = 0;

        while(n != 0){
            int digit = n % 10;
            n = n /10;
            reverse = reverse *10 + digit;
        }
    

        if(reverse == original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        

    }
}
