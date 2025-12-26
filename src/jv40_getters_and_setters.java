public class jv40_getters_and_setters {

    // They help protect object data and add rules for accessing or modifying the information
    // GETTERS = Methods that make a field READABLE.
    // SETTERS = Methods that make a field WRITEABLE.

    static void main() {
        Car3 car = new Car3( "Charger" ,"yellow", 10000);



        System.out.println(car.getModel() + " "+ car.getColor() + " " + car.getPrice() );


        car.setColor("blue");
        car.setPrice(443); //changed using setter method
        System.out.println(car.getModel() + " "+ car.getColor() + " " + car.getPrice() );

    }

}
