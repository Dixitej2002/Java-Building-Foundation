class Main{

    public static void main(String[] args) {
        // Car c1 = new Car("Red");

        // Circle cir = new Circle(5);
        // cir.area();

        // Rectangle rec = new Rectangle(20,10);
        // rec.area();

        // Animal an = new Lion();

        // an.eat();

        // ClassC cc = new ClassC();
        // cc.methodA();
        // cc.methodB();

        // ConA b = new B2(10);

        Up up = new Down();
        up.high(); // upcasting is support for runtime polymorphism.It has done automatically.
        // up.down();

        Down dn = (Down) up;
        dn.down(); // Downcasting Up -> Down. It has done explicitly or manually.


    }
}