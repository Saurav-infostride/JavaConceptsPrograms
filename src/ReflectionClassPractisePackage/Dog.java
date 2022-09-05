package ReflectionClassPractisePackage;

public class Dog{

    private String name;
    private int age;
    public String color;

    public Dog(){
        this.name = "Bolt";
        this.age = 2;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void kill(){

    }
}
