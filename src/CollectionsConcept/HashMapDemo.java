package CollectionsConcept;
import java.util.HashMap;

public class HashMapDemo {
     public static void main(String [] args){
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Initial HashMap: " + map);

        //adding key values
        map.put(0, "Python");
        map.put(1, "Java");
        map.put(2, "React");
        map.put(3, "JavaScript");
        map.put(4, "PHP");
        System.out.println("HashMap after adding values: " + map);
        System.out.println("Key set: " + map.keySet());

        //get method
        String value = map.get(1);
        System.out.println(value);

        //to add pair in between
        map.put(1, "Core Java");
        System.out.println(map);

        //size
        int ele = map.size();
        System.out.println(ele);

        // remove element associated with key 2
        String value1 = map.remove(4);
        System.out.println("Removed value: " + value1);

        //Loop
        for(int i=0; i<map.size(); i++){
           System.out.print(i);
        }
        System.out.println();

        // Entry Set
        System.out.println("Entry set : " + map.entrySet());
     }
}
