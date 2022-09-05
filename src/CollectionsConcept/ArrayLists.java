package CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(7);
        System.out.println("Adding elements : " + list);

        //get elements
        int element = list.get(1);
        System.out.println("Get elements : " + element);

        list.add(1,1);
        System.out.println("Add elements in between : " + list);

        //set element
        list.set(2,4);
        System.out.println("Set elements : " + list);

        //delete element
        list.remove(2);
        System.out.println("Elements in list now present : " + list);

        //size of list
        int size = list.size();
        System.out.println("Size of list : " + size);

        //for loop
        for (int i =0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println("Sorted list : " + list);
    }
}
