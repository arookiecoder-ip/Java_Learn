import java.util.Scanner;

public class jv03_madlibs {

    public static void main(String[] args) {
        //MAD libs game

        Scanner scanner =new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.println("enter a noun: ");
        noun1=scanner.nextLine();
        System.out.println("enter an adjective: ");
        adjective2 =scanner.nextLine();
        System.out.println("enter a verb: ");
        verb1=scanner.nextLine();
        System.out.println("enter an adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a "+ adjective1 +"zoo.");
        System.out.println("in an exhibit,I saw a"+ noun1 +".");
        System.out.println(noun1 +"was"+ adjective2+"and"+verb1 +"!");
        System.out.println("i was "+adjective3+"!");
        scanner.close();

    }
}
