package BasicJavaPrograms;

import java.util.Arrays;

public class ReverseFewCharOfString {
    public static void main(String[ ] args) {
        String s="We123Pop234Madam";
        String str = "We123Pop234Madam";
        str = str.replaceAll("[^-?0-9]+", " ");
        System.out.print(str);
        System.out.println("Input String is : " + s);
        String reverseS = "";
        String[] word = s.split("(?>\\d)");
        String[] word2 =  s.split("(?>\\D)");
        int i=0;
        int count =  s.split("(?=\\d)").length - Arrays.asList(str.trim().split(" ")).size();
        for(String w:word) {
            reverseS = reverseS + new StringBuffer(w).reverse()+ word2[i];
            if(i>=count) {
                i=0;
                continue;
            }
            i++;
        }
        System.out.println("Output string is : " + reverseS);
    }
}