import java.util.Random;

public class jv07_random_numbers {
    public static void main(String[] args) {
        Random random =new Random();

        int number1;
        double number2;
        boolean number3;
        number1 =random.nextInt(1,100);
        number2 =random.nextDouble(1,100);
        number3 =random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }

}
