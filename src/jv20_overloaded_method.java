public class jv20_overloaded_method {
    static void main() {
        System.out.println(add(2,3,3));
    }
    static double add(double a ,double b){
        return a+b;
    }
    static double add(double a ,double b,double c){
        return a+b+c;
    }
}

//overloaded method =method that share the same name ,
  //                 but different parameters
//                   signature= name +parameters