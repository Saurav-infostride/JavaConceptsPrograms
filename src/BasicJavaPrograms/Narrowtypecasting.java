public class Narrowtypecasting {
    public static void main(String args[]){
        double d = 166.66;
        //double data type into long
        long l = (long)d;
        //long data type into int
        int i = (int)l;
        System.out.println("Before conversion: "+d);
        System.out.println("After conversion into long type: "+l);
        System.out.println("After conversion into int type: "+i);
    }
}
