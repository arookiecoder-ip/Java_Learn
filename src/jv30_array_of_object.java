public class jv30_array_of_object {
    static void main() {


        Bike bike1 = new Bike("hero", "red");
        Bike bike2 = new Bike("yamaha", "blue");
        Bike bike3 = new Bike("honda", "green");

        Bike[] bikes = {bike1, bike2, bike3};

//        for (int i = 0; i < bikes.length; i++) {
//            bikes[i].drive();
//
//        }

        for (Bike bike:bikes){
            bike.drive();
        }


    }
}
