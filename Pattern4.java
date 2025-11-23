

public class Pattern4 {

    public static void main(String[] args) {
       int n = InputFun.input();
       for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }

        for(int k=1; k<(2*i-1);k++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
    
}
