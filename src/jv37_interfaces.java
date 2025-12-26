public class jv37_interfaces {

//    Interface = A blueprint for a class that specifies a set of abst
//    that implementing classes MUST define.
//    Supports multiple inheritance-like behavior.

    static void main() {

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish1 fish = new Fish1();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}
