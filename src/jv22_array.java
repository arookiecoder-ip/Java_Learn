import java.util.Arrays;

public class jv22_array {

    static void main() {

        String[] fruits ={"apple","banana","coconut"};

        fruits[0]="orange";

        int numOfFruits=fruits.length;
        System.out.println(numOfFruits);

        Arrays.sort(fruits);

//        Arrays.fill(fruits ,"pineapple");

//        System.out.println(fruits[0]);

        for(int i=0;i<fruits.length;i++){
            System.out.print(fruits[i] + " ");
        }

        System.out.println();
        for(String fruit:fruits){ //enhanced for loop
            System.out.println(fruit);
        }
    }
}
