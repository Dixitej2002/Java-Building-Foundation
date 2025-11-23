public class Pattern5 {

    public static void main(String[] args) {
        int n = InputFun.input();
        char ch = 'A';

        for(int i=1 ; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(ch);
                
            }

            System.out.println();
            ch++;
        }
    }
    
}
