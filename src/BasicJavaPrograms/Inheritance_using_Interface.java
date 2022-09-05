interface AnimalEat{
    void eat();
}
interface AnimalTravel{
    void travel();
}
interface AnimalColor{
    void color();
}
interface AnimalName{
    void name();
}
interface HumanName{
    void fname();
}
class Animal implements AnimalEat, AnimalTravel, AnimalColor, AnimalName{
    public void eat(){
        System.out.println("Animal is eating");
        }
    public void travel(){
        System.out.println("Animal is travelling towards north");
        }
    public void color(){
        System.out.println("Animal color is black");
    }
    public void name(){
        System.out.println("Animal name is Panther");
    }
    }
public class Inheritance_using_Interface {
    public static void main(String [] args){
        Animal a = new Animal();
        a.eat();
        a.travel();
        a.color();
        a.name();
    }
}
