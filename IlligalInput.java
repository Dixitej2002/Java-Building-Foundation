import java.util.Scanner;

public class IlligalInput {
    
    static void userInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            throw new IllegalArgumentException(n + "is negative");
        }
    }
public static void main(String[] args) {
    userInput();
}


}
