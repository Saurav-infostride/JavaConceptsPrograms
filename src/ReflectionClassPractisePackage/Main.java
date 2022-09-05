package ReflectionClassPractisePackage;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("bob", 3);

        Class dogClass = dog.getClass();

        System.out.println("Class Name : " + dogClass.getName());
        System.out.println("Methods : " + dogClass.getMethods() );
        System.out.println("Interface : " + dogClass.isInterface());
        System.out.println("Array : " + dogClass.isArray());

        Constructor []  constructors = dogClass.getConstructors();
        for (Constructor constructor : constructors){
            System.out.println("Constructor name" + constructor.getName());
            if (constructor.getParameterCount() == 0){
                System.out.println("No arg constructor");
            }else{
                Parameter[] parameters = constructor.getParameters();
                for (Parameter parameter : parameters){
                    System.out.println("Parameter : " + parameter.getName() + " : " + parameter.getType());
                }
            }
        }

        //print the methods
        System.out.println("Methods");
        Method[] methods = dogClass.getMethods();
        for (int i = 0; i < methods.length; i++){
            System.out.println("Method a" + (i + 1) + "  " + Modifier.toString(methods[i].getModifiers()) + "  "
                    + methods[i].getReturnType().getName() + " : " + methods[i].getName() + " : "
                    + Arrays.toString(methods[i].getParameters()));
        }

        System.out.println(" Declared Methods");
        Method[] declaredMethods = dogClass.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++){
            System.out.println("Declared Method a" + (i + 1) + "  " + Modifier.toString(declaredMethods[i].getModifiers()) +
                    "  " + declaredMethods[i].getReturnType().getName() + " : " + declaredMethods[i].getName() + " : " +
                    Arrays.toString(declaredMethods[i].getParameters()));
        }

        //print the fields

        System.out.println("----- Fields ----- ");

        Field[] fields = dogClass.getFields();
        for (Field field : fields){
            System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " "
                    + field.getName());
        }

        System.out.println("----- Declared fields -----");

        Field[] declaredFields = dogClass.getDeclaredFields();
        for (Field declaredField : declaredFields){
            System.out.println(Modifier.toString(declaredField.getModifiers()) + " " + declaredField.getType().getName() +
                    " " + declaredField.getName());
        }
    }
}
