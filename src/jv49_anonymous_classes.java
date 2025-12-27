public class jv49_anonymous_classes {
    static void main() {
//        Anonymous class = A class that doesn't have a name. Cannot be reused.
//        Add custom behavior without having to create a new class.
//        Often used for one time uses (TimerTask, Runnable, callbacks)



        dog dog1= new dog();


        dog dog2 = new dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo Says Ruh roh");
            }
        };

        dog1.speak();
        dog2.speak();



    }
}
