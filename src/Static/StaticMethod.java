package Static;

public class StaticMethod {

    static void info(){
        System.out.println("Static method");
    }
    public static void main(String [] args){
        info(); //can be called directly
        StaticMethod.info(); // can be called through class also
    }
}
