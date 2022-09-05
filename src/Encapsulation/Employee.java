package Encapsulation;

public class Employee {
    private int emp_ID;

    public void setEmpID(int empID) {
        emp_ID = empID;
    }
    public int getEmp_ID(){
        return emp_ID;
    }
    public static void main(String [] args){
        Employee emp = new Employee();
        emp.setEmpID(101);
        System.out.println(emp.getEmp_ID());
    }
}
