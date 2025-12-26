public class Bike {
    String model;
    String color;

    Bike(String model,String color){
        this.model=model;
        this.color=color;
    }
    void drive(){
        System.out.println("you drive the " +this.color +" " +this.model);
    }
}
