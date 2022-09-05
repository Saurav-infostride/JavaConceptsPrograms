public class Practise {
    public static void main(String[] args) {
        String abc = "pap";
        String rev = "";
        for (int i = abc.length()-1; i >= 0; i--){
            rev = rev + abc.charAt(i);
        }
        System.out.print(rev);
        if (abc.matches(rev)){
            System.out.println(" " + "String is palindrome");
        }else{
            System.out.println("It's not");
        }
    }
}
