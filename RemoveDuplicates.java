import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String result = "";

        for(int i = 0; i < s.length() ; i++){
            if(result.indexOf(s.charAt(i)) == -1){
                result = result + s.charAt(i);
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
    
}
