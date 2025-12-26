public class jv38_polymorphism {
    static void main() {
//        Polymorphism = "POLY" = "MANY"
//        "MORPH" = "SHAPE"
//        Objects can identify as other objects.
//        Objects can be treated as objects of a common superclass.

        Car2 car = new Car2();
        Bike1 bike = new Bike1();
        Boat boat= new Boat();

        Vehicle[] vehicles = {car, bike,boat};

        for(Vehicle vehicle: vehicles){
            vehicle.go();

        }
    }
}
