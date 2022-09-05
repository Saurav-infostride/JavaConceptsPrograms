public class BufferString {

    public static void main(String[] args) {
        StringBuffer sf = new StringBuffer("law");
        sf.reverse();
        System.out.println(sf);
        String input="hello";
        StringBuilder input1=new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }
}
