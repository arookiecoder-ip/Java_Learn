import java.util.ArrayList;
import java.util.Collections;

public class jv44_arraylist {
    static void main() {
//        ArrayList = A resizeable array that stores objects (autoboxing).
//        Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>(); //< > contains the data type

        list.add(3);
        list.add(6);
        list.add(2);


//        list.remove(0); //need to mention the index no of the array list

//        list.set (0,5); //change the value of a certain index (index no, updated value)

        System.out.println(list.get(1)); //get the element of a certain index

        System.out.println(list);

        System.out.println(list.size()); //get the size

        Collections.sort(list); // sorting the array

        System.out.println(list);

    }
}
