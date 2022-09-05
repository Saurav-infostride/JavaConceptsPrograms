package MethodOverriding;

public class Second extends First{
    void display(){
        System.out.println("Second class");
    }
    public static void main(String [] args){
        First fir = new First();
        fir.display(); //will print First class method
        Second sec = new Second();
        sec.display(); //will print Second class method, due to overriding
    }

}
