public class jv13_tenary_operator {
    static void main() {
        int score = 78;

        //tenary operator = Return 1 of 2 values if a condition is true
        //variable=(condition) ? iftrue :ifFalse;

        String passOrFail = (score>=60) ? "PASS": "FAIL";
        System.out.println(passOrFail);


        int number =4;
        String evenorodd = (number %2 ==0) ? "EVEN" : "ODD" ;
        System.out.println(evenorodd);
    }
    }
