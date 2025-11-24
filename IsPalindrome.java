import java.util.Scanner;

public class IsPalindrome {

   static boolean isPalidrome(){
       System.out.print("Enter String Character: ");
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int left = 0;
        int right = s.length()-1;

        while(left < right){

            System.out.println("Left " + s.charAt(left));
            System.out.println("Right " + s.charAt(left));
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

       return true;



    }

    public static void main(String[] args) {
        if(isPalidrome()){
            System.out.println("Your string is a palindrome");
        }
        else{
            System.out.println("Your string is not a palindrome");
        }
    }
    
}
