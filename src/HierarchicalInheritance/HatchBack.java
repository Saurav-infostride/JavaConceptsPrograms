package HierarchicalInheritance;

public class HatchBack extends Company {

    String nameOfVehicle;
    String colorOfVehicle;
    int modelYear;

    void etiosFeatures(String vehicleName, String color, int year){
        nameOfVehicle = vehicleName;
        colorOfVehicle = color;
        modelYear = year;
        System.out.println(vehicleName + " " + color + " " +  year);
    }
    public static void main(String [] args){
        HatchBack etios = new HatchBack();
        etios.companyName("Toyota");
        etios.etiosFeatures("Etios", "Black", 2021);
    }
}
