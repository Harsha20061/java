class Rectangle{
    double length,width,area;
    Rectangle(){
        length=5;
        width=10;
        area=length*width;
        System.out.println("area of rectangle is "+area);
    }
    Rectangle(double l,double w){
        length = l;
        width = w;
        area = length*width;
        System.out.println("area of rectangle "+area);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Rectangle obj2 = new Rectangle(10, 10);
    }
}
