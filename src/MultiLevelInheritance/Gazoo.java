package MultiLevelInheritance;

public class Gazoo extends Toyota{
    String carName;
    String color;

    void vehicleInfo(String vehicleName, String vehicleColor, String vehicleType, int vehicleYear){
        carName = vehicleName;
        color = vehicleColor;
        type = vehicleType;
        modelYear = vehicleYear;
        System.out.println("Car is " + carName + " in " + color + " color, is " + type + " and manufactured in year " +
                modelYear);
    }

    public static void main(String [] args){
        Gazoo gaz = new Gazoo();
        gaz.name("Toyota");
        gaz.vehicleInfo("Gazoo","Black", "Hatchback", 2022);
    }
}
