import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        int a = 10, b= 20, c= 30, d;
        Scanner s = new Scanner(System.in);
        d = (a > b)? (a > c ? a:c) : (b > c ? b : c);
        System.out.println(d);
    }
}
