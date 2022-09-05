class Human{
    String name;    //Here i made data members of class
    int age;
    String address;

    Human( String name, int age, String address)   //Constructor named Human would initialize data members,
    {                                              // with the values passed arguements while object
        this.name = name;                          // of that class is created
        this.age = age;
        this.address = address;
    }
}
public class ParameterizedConst {
    public static void main(String [] args){
        //This would start the parameterized constructor
        Human a = new Human("Jack", 25, "Death valley, California");
        System.out.println("Name: " + a.name +" Age: "+ a.age  + " Address: "  + a.address);
    }
}
