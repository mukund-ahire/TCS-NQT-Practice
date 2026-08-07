import java.util.HashSet;

public class BasicHashSet{
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        // set.add(10); //it also gives the boolean value.
        // set.add(20);
        // set.add(30);
        // set.add(10);

        // set.contains(10); //returns true or false.
        // set.remove(10);
        // set.size();

        set.add(5);
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(10);

        System.out.println(set.size()); //Checking the size of the set;
    }   
}