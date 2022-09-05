class Bicycle{
    //class has two fields
    public int gear;
    public int speed;

    //Class has 1 constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    //the Bicycle class has 3 methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }
    // toString() method to print in  of bicycle class
    public String toString()
    {
        return("No. of gears are : " + gear + "\n" + "speed of bicycle is : " + speed);
    }
}
// derived class
class MountainBike extends Bicycle {
    // the MountainBike subclass adds one more field
    public int seatHeight;

    //subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight) {
        //invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    //MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is : " + seatHeight);
    }
}
//driver class
public class Multilevelinheritance{
    public static void main(String[] agrs)
    {
        MountainBike mb = new MountainBike(8, 1600, 52);
        System.out.println(mb.toString());
    }
}