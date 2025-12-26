public class jv15_logical_operator {
    static void main() {
//        && =AND
//        || =OR
//        ! =NOt
        double temp = -20;
        boolean isSunny =false;

        if(temp <=30 && temp >=0 && isSunny){
            System.out.println("The weather is good and sunny! ");
        }
        else if(temp <=30 && temp >=0 && !isSunny){
            System.out.println("the weather is good but not sunny!");
        }
        else if(temp > 30 || temp <0 && !isSunny) {
            System.out.println("the weather is bad!");
        }

    }


}
