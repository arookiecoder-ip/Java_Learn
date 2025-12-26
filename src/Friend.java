public class Friend {
    static int numOfFriends;
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showfriend(){
        System.out.println("You have " + numOfFriends + " total friends.");
    }

}