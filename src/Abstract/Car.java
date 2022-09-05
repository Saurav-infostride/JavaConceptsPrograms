package Abstract;

public class Car extends Vehicle{
    private String name;
    private String company;
    private String color;
    private double price;

    @Override
    void display(){
        System.out.println("No. of tyres");
    }
    public static void main(String [] args){
        Car gazoo = new Car();
        gazoo.display();
    }
}
