public class jv19_methods {
    static void main() {

        String name ="bro";
        int age = 25;


        happybirthday(name,age);
    }

    static void happybirthday(String name,int age){
        System.out.println("Happy birthday to You!");
        System.out.printf("happy birthday dear %s!\n" ,name);
        System.out.printf("You are %d years old!",age);
        System.out.println("\nhappy birthday to you");
    }
}
