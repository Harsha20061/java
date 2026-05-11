import java.util.StringTokenizer;

public class TokenDemo {
    public static void main(String[] args) {

        String str = "Apple,Mango,Banana,Grapes";

        // Using comma as delimiter
        StringTokenizer st = new StringTokenizer(str, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}