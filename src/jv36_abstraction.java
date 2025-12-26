public class jv36_abstraction {
//    abstract = Used to define abstract classes and methods.
//    Abstraction is the process of hiding implementation details
//    and showing only the essential features;
//    Abstract classes CAN'T be instantiated directly
//    Can contain 'abstract' methods (which must be implemented)
//    Can contain 'concrete' methods (which are inherited)
static void main() {


        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(2,5);
        Rectangle rectangle = new Rectangle(45,23);

        circle.display();
        triangle.display();
        rectangle.display();

    System.out.println(circle.area());
    System.out.println(triangle.area());
    System.out.println(rectangle.area());

        }

}
