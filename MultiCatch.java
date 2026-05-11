import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a/b;
            System.out.println("a divided by b is "+result);
            int arr[]= {10,20,30};
            System.out.println("value at 5th index "+arr[5]);
            sc.close();

        } catch (ArithmeticException e) {
            System.out.println("divide by zero error "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index error occured "+e);
        }
        

    }
    
}
