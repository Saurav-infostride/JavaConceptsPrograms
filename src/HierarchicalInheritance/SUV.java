package HierarchicalInheritance;

public class SUV extends Company{
    String carName;
    String carColor;
    int carYear;

    void carFeatures(String name, String color, int year){
        carName = name;
        carColor = color;
        carYear = year;
        System.out.println(name + " " + color + " " + year);
    }

    public static void main(String [] args){
        SUV fortuner = new SUV();
        fortuner.companyName("Toyota");
        fortuner.carFeatures("Fortuner", "Black", 2022);
    }

}
