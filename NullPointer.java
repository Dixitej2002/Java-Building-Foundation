public class NullPointer {
    
    static void checkName(String name){
      
        if(name == null){
            throw new NullPointerException("Null pointer exception");
        }
    }

    public static void main(String[] args) {
        checkName(null);
    }
}
