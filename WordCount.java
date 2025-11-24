import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        System.out.println("Enter String: ");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int wc = 1;
        for(int i = 0; i< s.length(); i++){
            // char ch= s.charAt(i);
            if(s.charAt(i) == ' '){
                wc++;
            }
        }

        System.out.println("Word Count " + wc);
    }
    
}
