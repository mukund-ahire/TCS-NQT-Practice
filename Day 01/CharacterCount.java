import java.util.*;

public class CharacterCount{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char ch = scan.next().charAt(0);

        char[] arr = str.toCharArray();
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}