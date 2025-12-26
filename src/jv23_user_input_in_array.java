import java.util.Scanner;
public class jv23_user_input_in_array {
    static void main() {
        Scanner scanner = new Scanner(System.in);


//        String[] foods =new String[4];  // creates an array that can hold 4 String elements

        String[] foods;
        int size;

        System.out.println("what number of foods do u want : ");
        size = scanner.nextInt();
        scanner.nextLine();  //clears the input buffer

        foods = new String[size]; //Declare the size of the array through the input

        for (int i =0; i<foods.length;i++){
            System.out.print("enter a food: \n");
            foods[i] =scanner.next();  //takes the input for the array
        }
        for(String food:foods){
            System.out.print(food + " "); //This prints the elements taken as input in the array
        }

        scanner.close();

    }
}
