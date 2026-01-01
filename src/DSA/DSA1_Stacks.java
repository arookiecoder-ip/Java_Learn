package DSA;

import java.util.Stack;


public class DSA1_Stacks {
    static void main() {

//        stack = LIFO data structure. Last-In First-Out
//        stores objects into a sort of "vertical tower"
//        push() to add to the top
//        pop() to remove from the top


        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("DOOM");
        stack.push("FFVII");
        stack.push("skyrim");


        System.out.println(stack.peek()); // prints the top element

        System.out.println(stack.search("DOOM")); // search the index of an element in a stack


        System.out.println(stack.empty()); //check if the stack is empty or not

        System.out.println(stack); //print the stack

        stack.pop(); //remove the top item or the last added item, in this case skyrim is removed
        System.out.println(stack);

    }
}
