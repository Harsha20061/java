class Addition{
    void Add(int a , int b){
        System.out.println("sum of two numbers " +(a+b));
    }
 
    void Add(int a, int b, int c){
        System.out.println("sum of three numbers "+(a+b+c));
    }

}
public class MethodOverloadingDemo {
    public static void main(String args []){
        Addition obj1 = new Addition();
        obj1.Add(10,20);

        Addition obj2 = new Addition();
        obj2.Add(12, 12, 12);

    }
    
}
