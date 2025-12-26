public class jv31_static {
    static void main() {
//        static = Makes a variable or method belong to the class
//        rather than to any specific object.
//        Commonly used for utility methods or shared resources.
        Friend friend1 = new Friend("spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("John");

    Friend.showfriend();
    }


}
