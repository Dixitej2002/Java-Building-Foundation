public class ClassC implements A, B {

    @Override
    public void methodB() {
       System.out.println("This is the methodB from interface B");
    }

    @Override
    public void methodA() {
        System.out.println("This is the methodA from interface A");
    }
    
    
}
