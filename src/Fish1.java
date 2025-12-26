public class Fish1 implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("the fish is swimming away");
    }
    public void hunt(){
        System.out.println(" this fish is hunting.");
    }
}
