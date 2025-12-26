import java.util.Scanner;

public class jv05_shopping_cart_program {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency ='$';
        double total;

        System.out.println("what item would u like to buy:  ");
        item =scanner.nextLine();



        scanner.close();
    }
}
