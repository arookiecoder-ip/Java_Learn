import java.util.Scanner;
public class jv27_OOP {
    static void main() {
        // Object =An entity that holds data(attributes)
        //         and can perform actions (method)
        //         It is a reference data type
    Car car = new Car();   // reference the Car.java file

        car.price = 43553; //value of the attributes can be changed

        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.model);
        System.out.println(car.price);

//        System.out.println(car.isRunning);
//        car.start();
//        System.out.println(car.isRunning);
//        car.stop();
//        System.out.println(car.isRunning);

        car.drive();
        car.brake();

    }

}
