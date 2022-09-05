package BasicJavaPrograms;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String name = myObj.nextLine();
        System.out.println("Enter name : " + name);
        int count = 0;
        for (int i = 0; i < name.length();i++){
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
             || name.charAt(i) == 'u'){
            count++;
            }
        }
        System.out.println(count);
    }
}
