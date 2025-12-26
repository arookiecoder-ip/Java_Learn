import java.util.Scanner;
public class jv14_enhanced_switches {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday" ,"Tuesday" ,"Wednesday" ,"Thursday" ,"Friday" -> System.out.println("It is a weeekday");
            case "Saturday" , "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println("It is not a day");


//            Scanner.close();
        }
    }
}
