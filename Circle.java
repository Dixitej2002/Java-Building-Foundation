public class Circle extends Shape {

    double r;
    double PI = Math.PI;
    
    Circle(double r){
        this.r = r;
    }

    @Override
    void area() {
        double area = PI * r * r;
        System.out.println("Area of Circle: " + area);
    }
    
}
