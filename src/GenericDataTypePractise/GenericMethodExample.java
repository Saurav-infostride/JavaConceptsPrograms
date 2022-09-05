package GenericDataTypePractise;

public class GenericMethodExample {

    public <T> void printArray( T [] s){
//        for (T x:s) {
//            System.out.println(x);
//        }

        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        GenericMethodExample obj = new GenericMethodExample();
        String [] countries = {"India", "Russia", "US"};
        Integer [] numbers = {1, 2, 3, 4, 5, 6};
        Character [] alphabets = {'A','B', 'C', 'D'};
        // T in foreach loop will declare String type when Array countries will be called
        obj.printArray(countries);
        // T in foreach loop will declare Integer type this time, when Array numbers will be called
        obj.printArray(numbers);
        obj.printArray(alphabets);
    }
}
