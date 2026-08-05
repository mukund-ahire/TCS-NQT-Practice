import java.util.*;

public class VowelsAndConsonants{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int vowels = 0;
        int consonants = 0;

        char[] arr = str.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        
        System.out.println(vowels);
        System.out.println(consonants);

        scan.close();
    }
}