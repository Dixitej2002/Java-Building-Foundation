import java.util.HashSet;

public class RDHashset {

    public static void main(String[] args) {
        String ch[] = {"a","b","a","c"};

        HashSet<String> hset = new HashSet<>();
        for(String s : ch){
            hset.add(s);
        }

        System.out.println(hset);

    }
    
}
