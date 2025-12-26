public class jv11_string {
    static void main() {
        String name ="AsusZenbook";

        int length =name.length(); //gives length of a string
        char letter=name.charAt(0); //returns the  0th index of the string
        int index= name.indexOf("o"); //returns the index number of a character of a string
        int lastIndex =name.lastIndexOf("o"); //return the last index of a string if any character is repeatable


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        String name1;
        name1=name.toUpperCase(); //converts the string to uppercase
        System.out.println(name1);

        String name2;
        name2 =name.toLowerCase();//converts the string to lowercase
        System.out.println(name2);

        String name3;
        name3= name.replace("o", "a"); //replaces o to a
        System.out.println(name3);

        System.out.println(name.isEmpty());

    }
}
