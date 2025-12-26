public class jv09_printf {
    static void main() {
        String name ="spongebob";
        char firstletter = 'S';
        int age =32;
        double height = 60.4;
        boolean isEmployed= true;

        System.out.printf("hello %s",name); //to print string name use %s
        System.out.printf("\nyour name starts with %c",firstletter); // to print char use %c
        System.out.printf("\nyou are %d years old",age); //to print int use %d
        System.out.printf("\nyour heigh is  %f cm ",height); // to print double use %f
        System.out.printf("\nEmployed: %b",isEmployed);


        System.out.printf("\n%s is %d years old",name,age); //multiple printf function in one line

        System.out.println("\n\n");

        System.out.println("\n\n\nDecimals");
        double price1 =434.3454545;
        double price2=5555664.343;
        double price3=-4334.34;

        System.out.printf("%.3f\n",price1); //precision upto 3 decimal
        System.out.printf("%,.3f\n",price2);// %, separated the digits after every thousand
        System.out.printf("%(.3f\n %(.3f\n %(.3f",price1,price2,price3); // puts bracket for negative number


        System.out.println("\n\n Padding");
        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7890;

        //padding
        System.out.printf("%04d\n",id1); //padding to 4 digit , %04d
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);


        System.out.println("\n Justified Padding");

        System.out.printf("%4d\n",id1); // justified padding to 4 digit , %4d
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        System.out.println("\n Left Justified Padding");

        System.out.printf("%-4d\n",id1); //  Left justified padding to 4 digit , %4d
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);


    }
}
