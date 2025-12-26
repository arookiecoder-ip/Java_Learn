public class jv34_method_overriding {
    static void main() {
//        Method overriding = When a subclass provides its own
//        implementation of a method that is already defined.
//        Allows for code reusability and give specific implementations.
        Dog1 dog = new Dog1();
        Cat1 cat = new Cat1();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }

}
