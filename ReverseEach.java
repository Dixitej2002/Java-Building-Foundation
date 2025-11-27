import java.util.Scanner;

public class ReverseEach {

     
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";

        String words[] = s.split(" ");

        for(String w : words){
            String rev = "";

            for(int i = w.length()-1; i >= 0; i--){
                rev = rev + w.charAt(i);
            }
            result = result + rev + " ";

        }

        System.out.println("after reverse : " + result);

    }
}
