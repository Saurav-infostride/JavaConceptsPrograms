public class Wideningtypecasting {
    public static void main(String[] args){
        int x = 7;
        //integer type into long type automatically
        long y = x;
        //long type into float type automatically
        float z = y;
        System.out.println("Before conversion, int value: "+x);
        System.out.println("After conversion, long value: "+y);
        System.out.println("After conversion, float value: "+z);
    }
}
