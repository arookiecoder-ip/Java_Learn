public class jv10_nested_if_statements {
    static void main() {
        boolean isStudent=true;
        boolean isSenior=true;
        double price=9.99;

        if(isStudent){

            if(isSenior){
                System.out.println("you get a senior discount of 20%");
                price *=0.8;

            }
            else {
                System.out.println("you get a student discount of 10%");
                price *= 0.9;  //makes the price 90%
            }

        }
        else{
            price *=1;


        }

        System.out.printf("the price of the ticket is : $%.2f ",price);
    }
}
