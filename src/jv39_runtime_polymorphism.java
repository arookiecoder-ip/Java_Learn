import java.util.Scanner;

public class jv39_runtime_polymorphism {
    // Runtime polymorphism = When the method that gets executed is decided
    // at runtime based on the actual type of the object

    static void main() {

        Scanner scanner = new Scanner(System.in);

        Animal2 animal;

        System.out.println("Would youu like a dog or a cat?(1 = dog , 2 = cat)");

        int choice = scanner.nextInt();

        if(choice ==1){
             animal = new Dog2();
             animal.speak();
        }
        if(choice ==2){
            animal = new Cat2();
            animal.speak();
        }

    }
}
