package MethodOverloading;

public class NoOfArguments {
    void display(){
        System.out.println("Without any argument");
    }

    void display(String a){
        System.out.println("With an argument, " + a );
    }

    public static void main(String [] args){
        NoOfArguments argue = new NoOfArguments();
        argue.display(); //this will call first one as there is no argument
        argue.display("Hello"); // this will call second one as we are passing an argument
    }
}
