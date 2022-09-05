public class InitialisingObjectsUsingMethods {
    String color;
    int age;

    public void initObjects(String a, int b){
        color = a;
        age = b;
    }

    public void display(){
        System.out.println("Buzo's color is " + color + " and his age is " + age);
    }

    public static void main(String [] args) {
        InitialisingObjectsUsingMethods buzo = new InitialisingObjectsUsingMethods();
        buzo.initObjects("black", 4);
        buzo.display();
    }
}
