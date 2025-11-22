public class Rectangle extends Shape {
    
    int length;
    int breath;

    Rectangle(int length, int breath){
        this.length = length;
        this.breath = breath;
    }

    @Override
    void area() {
        int area = length * breath;
        System.out.println(area);
    }

}
