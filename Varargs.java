public class Varargs{

    public static String variableArgrs(String... str){

        StringBuilder sb = new StringBuilder();
        for (String str2 : str) {
            sb.append(str2).append(" ");  
        }
        return sb.toString();
    }

 public static void main(String[] args) {
    
     System.out.println(variableArgrs(
        "aajnda","bbbbb","cccc","dddd","eee","ffff","ggg"
     ));

     
 }
}