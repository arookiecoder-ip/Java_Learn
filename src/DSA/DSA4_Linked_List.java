package DSA;

import java.util.LinkedList;

public class DSA4_Linked_List {
    static void main() {
        LinkedList<String> linkedlist = new LinkedList<>();


//        linkedlist.push("A"); //adding element to linked list
//        linkedlist.push("B");
//        linkedlist.push("C");
//        linkedlist.push("D");
//        linkedlist.push("E");
//        linkedlist.push("F");

        linkedlist.offer("A"); // add and sort the element
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("E");
        linkedlist.offer("F");

        System.out.println(linkedlist);

        linkedlist.poll(); // remove the first element
        System.out.println(linkedlist);

        linkedlist.add(4,"H");
        linkedlist.remove("C");
        System.out.println(linkedlist);

        linkedlist.addFirst("0"); //adding an element at the first
        System.out.println(linkedlist);


        linkedlist.addLast("4"); //adding an element to the last
        System.out.println(linkedlist);


        System.out.println(linkedlist.peekFirst()); //peek the last element
        System.out.println(linkedlist.peekLast());



    }

}
