package GenericDataTypePractise;

public class Main {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObj());

        Test<String> sObj = new Test<String>("Hello");
        System.out.println(sObj.getObj());
    }
}
