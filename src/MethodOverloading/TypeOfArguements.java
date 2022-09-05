package MethodOverloading;

public class TypeOfArguements {
    void display(String a){
        System.out.println("Arguement in string, " +a);
    }

    void display(int a){
        System.out.println("Arguement in int, " + a );
    }

    public static void main(String [] args){
        TypeOfArguements argue = new TypeOfArguements();
        argue.display("Hello"); //this will call first one as there is no argument
        argue.display(11); // this will call second one as we are passing an argument
    }
}
