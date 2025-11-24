public class StringReverse {

    public static void main(String[] args) {
        String name = "Saras";
        String reverse = " ";
        // System.out.println(name.length());

       for(int i= name.length()-1; 0 <= i;i--){
        reverse = reverse + name.charAt(i);
       }

       System.out.println(reverse);
    }
    
}
