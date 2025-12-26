public class jv01_helloworld {
    public static void main(String[] args){

        //this is my first java program

        /*
        this
         is
          a
           multi
           line
             comment

         */

        System.out.println("Hello, World!\n");
        System.out.println("how are you\n");
        System.out.println("wassup");
        System.out.println("hello");

        int age=21; //integer data types
        System.out.println(age);
        int year=2025;

        System.out.println("the year is "+ year );

        double price=90.22;
        double gpa =3.5;
        System.out.println(price + gpa);

        char grade ='A';
        char symbol='!';
        System.out.println(grade);

        boolean isStudent=true;
        boolean forsale =false;
        boolean isOnline=false;

        System.out.println(isStudent);

        if(isStudent){
            System.out.println("you are a student");
        }

        String name ="what is your name";
        System.out.println(name);
        System.out.println("hello "+ name); //concatenation


    }

}
