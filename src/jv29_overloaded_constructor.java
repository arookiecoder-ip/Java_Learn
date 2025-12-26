public class jv29_overloaded_constructor {
    static void main() {
//        overloaded constructors = Allow a class to have multiple constructors
//        with different parameter lists.
//        Enable objects to be initialized in various ways

        user user1 =new user("SamAltman");
        user user2 =new user("Apache","grger@gamil.com");
        user user3 =new user("alpha","ugrggr@gmail.com",3);
        user user4 =new user();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);






    }
}
