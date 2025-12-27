import java.util.HashMap;


public class jv52_hashmaps {
    static void main() {
//        HashMap = A data structure that stores key-value pairs
//        Keys are unique, but Values can be duplicated
//        Does not maintain any order, but is memory efficient
//        HashMap<Key, Value>

        HashMap<String ,Double> map = new HashMap<>();

        map.put("apple",0.34);
        map.put("orange",1.24);
        map.put("pineapple",66.34);
        map.put("grapes",10.24);
        map.put("guava",56.9);
        map.put("coconut",8.00);

        map.remove("grapes"); //remove any key


        System.out.println(map.get("guava")); // to find the value of a key
        System.out.println(map.containsKey("guava")); // to check if the value for the key exists
        System.out.println(map.containsValue("8.0")); // to check if the key for the value exists
        System.out.println(map.size()); // to check the size



        System.out.println(map);


    }
}
