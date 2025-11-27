import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine().trim();
        String sr = " ";

        int i = 0;
        while (i< s.length()) {
            if (s.charAt(i) != ' ') {
                sr = sr + s.charAt(i);
            }
            i++;
            
        }

        System.out.println(s + " after remove spaces "+ sr);
    }
    
}
