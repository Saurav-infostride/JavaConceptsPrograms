class Car {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class VehicleInheritance extends Car {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        VehicleInheritance myFastCar = new VehicleInheritance();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}
