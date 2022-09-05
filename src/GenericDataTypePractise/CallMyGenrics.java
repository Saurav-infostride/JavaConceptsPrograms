package GenericDataTypePractise;

public class CallMyGenrics {
    public static void main(String[] args) {


        MyGenerics<String> g1 = new MyGenerics(43, "Hello");
        String str = g1.getT1();
        System.out.println(str);
    }
}
