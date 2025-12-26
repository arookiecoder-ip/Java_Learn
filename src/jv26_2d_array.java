public class jv26_2d_array {
    static void main() {
        //2d array = where each element is an array
        // useful for storing a matrix for data

        String[] fruits ={"apple","orange","banana"};
        String[] vegetables ={"potato","onion","carrot"};
        String[] meats ={"chicken","mutton","panner"};


//        String[][] groceries = {{"apple", "orange", "banana"},
//                {"potato", "onion", "carrot"},
//                {"chicken", "pork", "beef", "fish"}};
//        groceries[0] [0] = "pineapple";


        String[][] groceries ={fruits,vegetables,meats};

        for(String[] foods : groceries){
            for(String food :foods){
                System.out.print(food +" " );

            }
            System.out.println();
        }
    }
}
