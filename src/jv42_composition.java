public class jv42_composition {
//    Composition = Represents a "part-of" relationship between objects.
//    For example, an Engine is "part of" a Car.
//    Allows complex objects to be constructed from smaller objects.

    static void main() {
        Car4 car = new Car4("Corvette",2025,"V8");

        System.out.println(car.model);

    }
}
