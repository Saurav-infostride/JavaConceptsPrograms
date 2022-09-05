package Static;

public class StaticVariable{
    int empID;
    String name;
    static String company = "Info";

    StaticVariable(int empID, String name){
        this.empID = empID;
        this.name = name;
    }

    void displayEmployeeInfo(){
        System.out.println("Employee Id : " + empID);
        System.out.println("Employee Name : " + name);
        System.out.println("Company Name : " +  company);
    }

    public static void main(String [] args){
        StaticVariable emp1 = new StaticVariable(01, "Jake");
        emp1.displayEmployeeInfo();
        StaticVariable emp2 = new StaticVariable(02, "Tyler");
        emp2.displayEmployeeInfo();
    }
}
