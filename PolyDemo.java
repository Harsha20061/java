class Shape{
    void area(){
        System.out.println("Area calculation of Shape ");
    }
}
class Rectangle extends Shape{
    int length ,breadth,rectarea;
    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    void area(){
        rectarea=length*breadth;
        System.out.println("area of rectangle is "+rectarea);
    }
}
class Circle extends Shape{
    double radius,circlearea;
    Circle(double r ){
        radius = r ;
    }
    void area(){
        circlearea=3.14*radius*radius;
        System.out.println("area of circle is "+circlearea);

    }
}
public class PolyDemo {
    public static void main(String args []){
        Rectangle r1 = new Rectangle(10,10);
        r1.area();

        Circle c1 = new Circle(10);
        c1.area();
    }
    
}
