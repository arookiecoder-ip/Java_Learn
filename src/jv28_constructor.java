public class jv28_constructor {
    static void main() {
//        constructor = A special method to initialize objects
//        You can pass arguments to a constructor
//        and set up initial values


        Student student1 =new Student("alpha",30,3.3); //Arguments Passed from Student.java class
        Student student2 =new Student("beta",23,6.5);

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student1.isEnrolled);

        student1.study();
        student2.study();
    }
}
