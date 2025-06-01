package isp;

public class Dog implements AnimalBueno, SwimmerAnimal{
    @Override
    public void eath() {
        System.out.println("Estoy comiendo");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz");
    }

    @Override
    public void swim() {
        System.out.println("Estoy nadando");
    }
}
