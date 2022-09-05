class Test {
    int multiply(int a, int b){  //->Non static method
        return a * b;
    }
    static int add(int a, int b){  //->Static method
        return a + b;
    }
}
public class Staticprgrm{
    public static void main(String [] args){
        Test st = new Test();  //->Created instance of static class here
        System.out.println("Multiplication =" + st.multiply( 2,2));  //->Called the non-static method
        System.out.println("Additon ="  + Test.add(2,2));  //->Called the static method
    }
}
//In above ex, we called the non static method by object of the class i.e. st.multiply(2,2);,
//But we called the static method by class name itself i.e. Test.add(2,2);
