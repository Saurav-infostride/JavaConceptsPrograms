package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(01, "Adam");
            Employee emp2 = new Employee(02, "Jake");
            Employee emp3 = new Employee(03, "Jack");
            Employee emp4 = new Employee(04, "Jacky");

            FileOutputStream fout = new FileOutputStream("output.text");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(emp1);
            out.writeObject(emp2);
            out.writeObject(emp3);
            out.writeObject(emp4);
            out.flush();

            out.close();
            System.out.println("Serialization and Deserialization has been successfully executed");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
