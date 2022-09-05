package Interfaces;

public class Third implements First, Second{
    public void display(){
        System.out.println("First interface");
    }
    public void show(){
        System.out.println("Second interface");
    }

    public void displaying() {
        System.out.println("Displaying method");
    }

    public static void main(String [] args){
        Third three = new Third();
        three.display();
        three.displaying();
        three.show();
    }
}
