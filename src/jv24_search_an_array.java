public class jv24_search_an_array {
    static void main() {
        int[] number = {1,3,6,73,762,6,73,76,};
        int target =6;
        boolean isFound =false;


        for (int i =0;i<number.length;i++ ){
            if(target ==number[i]){
                System.out.println("Element found at index : " +i);
                isFound =true;
                break;
            }
        }
        if(!isFound){
            System.out.println("number not in the element.");
        }
    }
}
