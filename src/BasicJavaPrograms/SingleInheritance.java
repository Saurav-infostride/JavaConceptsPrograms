class Employee {
    String ename;
    int eid;
    int esalary;
    String eaddr;

    public void getEmployeedetails() {
        System.out.println("Employee Name : " + ename);
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee Salary : " + esalary);
        System.out.println("Employee Address : " + eaddr);
    }
}
class Engineer extends Employee {
    public Engineer(String eName, int eId, int eSalary, String eAddr) {
        ename = eName;
        eid = eId;
        esalary = eSalary;
        eaddr = eAddr;
    }
        public void getEngineerdetails() {
            System.out.println("Engineer Details");
            System.out.println("------------------");
            getEmployeedetails();
        }
    }
class Accountant extends Employee {
        public Accountant(String eName, int eId, int eSalary, String eAddr){
            ename = eName;
            eid = eId;
            esalary = eSalary;
            eaddr = eAddr;
        }
            public void getAccountantdetails(){
                System.out.println("Accountant Details");
                System.out.println("------------------");
                getEmployeedetails();
            }
    }
class Manager extends Employee {
        public Manager(String eName, int eId, int eSalary, String eAddr){
            ename = eName;
            eid = eId;
            esalary = eSalary;
            eaddr = eAddr;
        }
            public void getManagerdetails(){
                System.out.println("Manager Details");
                System.out.println("------------------");
                getEmployeedetails();
            }
    }
public class SingleInheritance{
            public static void main(String [] args){
                Engineer engg = new Engineer("Abc", 001, 1000, "asd");
                engg.getEngineerdetails();
                System.out.println();
                Accountant acct = new Accountant("Def", 002, 900, "bte");
                acct.getAccountantdetails();
                System.out.println();
                Manager mng = new Manager("Ghi", 003, 800, "cuf");
                mng.getManagerdetails();
                System.out.println();
            }
}
