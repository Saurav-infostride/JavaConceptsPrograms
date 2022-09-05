public class Stringmethods {
    public static void main(String [] args){
        String name = "Saurav Sharma";
       // name = name.replaceAll("[a^zA-Z0-9]", "");
        System.out.println("Name =" + name);  //->Will print string
        System.out.println(name.length());   // --> will print hte length of the string
        System.out.println(name.replace('u','w'));  // --> will replace the cahracter with another character
        System.out.println(name.charAt(4));  //--> will print the character in string according to index
       // System.out.println(name);
        String rev = "";
        int length = name.length();
        for (int i = length-1; i >= 0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
