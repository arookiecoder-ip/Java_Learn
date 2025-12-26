public class jv17_for_loops {
    static void main() {
        for(int i =0;i <10;i++){ //for loops
            System.out.println("Pizza");
        }

        for(int i =0; i<10;i++){
            if (i ==5){ //Stops at the number in break
                break;
            }

            System.out.println(i+ " ");
        }

        System.out.println("\n\n");

        for(int i =0; i<10;i++){
            if (i ==5){
                continue; //skips the number and continue the loop
            }

            System.out.println(i+ " ");
        }

    }
}
