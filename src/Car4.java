public class Car4 {
    String model;
    int year;
    Engine engine;

    Car4(String model, int year,String engIneType){
        this.model= model;
        this.year= year;
        this.engine= new Engine(engIneType);

    }
}
