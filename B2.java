public class B2 extends ConA{
    
    public static int x;

    B2(){
        this(x);
        System.out.println("first B2 constructor call");
    }

    B2(int x){
        super(x);
        System.out.println("2nd B2 constrctor call: "+ x);
    }

}
