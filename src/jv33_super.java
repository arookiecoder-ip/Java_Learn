public class jv33_super {
    static void main() {
//        super = Refers to the parent class (subclass <- superclass)
//        Used in constructors and method overriding
//        Calls the parent constructor to initialize attributes

        Person person = new Person("tom", "riddle");
        Student1 student = new Student1("harry", "potter" , 43);

        person.showName();
        student.showName();
        System.out.println(student.gpa);

        student.showGPA();
    }
}
