public class Animal {

    String color;
    int age;

    public void dog(){
        System.out.println("Kallu");
    }
    public static void main(String args[]){
        Animal buzo = new Animal();
        buzo.dog();
        buzo.color = "Black";
        System.out.println("Kallu is of Black color.");
        buzo.age = 3;
        System.out.println("Kallu is 3 years old.");
        System.out.println("Kallu breed is German Shepherd.");

    }
}
