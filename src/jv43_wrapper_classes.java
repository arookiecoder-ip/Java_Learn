public class jv43_wrapper_classes {
//    Wrapper classes = Allow primitive values (int, char, double, boolean
//    to be used as objects. "Wrap them in an object"
//    Generally, don't wrap primitives unless you need an object.
//    Allows use of Collections Framework and static Utility Methods.

    static void main() {

        // autoboxing
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = '$';
//        Boolean d = true;

          //unboxing
//         int x = a ;
//         double y = b;
//         char z = c;
//         boolean w = d;


        String a = Integer.toString(123);
        String b = Double.toString(3.12);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d ;
        System.out.println(x);


        int e = Integer.parseInt("123");
        double f= Double.parseDouble("3.14");
        char g = "Pizza".charAt(0);
        boolean h = Boolean.parseBoolean("true");


        }
}
