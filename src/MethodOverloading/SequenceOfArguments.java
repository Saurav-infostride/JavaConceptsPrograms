package MethodOverloading;

public class SequenceOfArguments {

        void display(String a, int b){
            System.out.println(a + " " + b);
        }

        void display(int b, String a){
            System.out.println(b + " " + a);
        }

        public static void main(String [] args){
            SequenceOfArguments argue = new SequenceOfArguments();
            argue.display("Hello", 32); //this will call first one as there is no argument
            argue.display(32, "Hello"); // this will call second one as we are passing an argument
        }
}
