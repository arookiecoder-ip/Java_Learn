import java.util.ArrayList;

public class jv51_generic {
//    Generics = A concept where you can write a class, interface, or method
//    that is compatible with different data types.
//    <T> type parameter (placeholder that gets replaced with a real type)
//    <String> type argument (specifies the type)

    static void main() {

        Box<String , Double> box = new Box<>(); //defined the datatype of the class

        box.setItem("banana",3.23);
        System.out.println(box.getItem() +" " + box.getPrice());

    }



}
