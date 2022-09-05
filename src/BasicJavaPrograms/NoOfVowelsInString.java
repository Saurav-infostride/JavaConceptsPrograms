package BasicJavaPrograms;

public class NoOfVowelsInString {
    public static void main(String[] args) {
        String str = "abcaeioubbdd";
        int count =0 ;
        int ar = 0;
         for(int i=0; i<str.length(); i++)
         {
             if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                     || str.charAt(i) == 'i'
                     || str.charAt(i) == 'o'
                     || str.charAt(i) == 'u') {
                 count++;
             }
             }
        System.out.println("No of Vowels present in a String : " + count);
        System.out.print(ar);
         }
    }

