public class jv21_variable_scope {

    static int x=5;  //  class

        //JAVA Prioritizes local variable over class variable
    static void main() {

        int x=1; //LOCAL

        System.out.println(x);

        dosomething();
    }
    static void dosomething(){

//        int x=2; //LOCAL

        System.out.println(x);
    }
}
