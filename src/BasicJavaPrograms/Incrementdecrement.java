public class Incrementdecrement {
    public static void main(String [] args){
        int a = 2;
        int b = 4;
        int c = ++a + --b - ++b - --a + ++a;
              // 3 + 3 - 4 - 2 + 3
        System.out.println("c="+c);
    }
}
