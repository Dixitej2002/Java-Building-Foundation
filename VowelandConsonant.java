import java.util.Scanner;

public class VowelandConsonant {

    static void vcCounter(){
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String vowel = "aeiouAEIOU";
        String s = sc.nextLine();

        int v = 0;
        int c = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetter(ch)){
                if(vowel.indexOf(ch) != -1){
                    v++;
                }
                else{
                    c++;
                }
            }
        }

        System.out.println("Vowel: " + v);
        System.out.println("Consonant: " + c);

    }

    public static void main(String[] args) {
        vcCounter();
    }
    
}
