package isp;

public class Eagle implements AnimalBueno, FlyerAnimal{
    @Override
    public void eath() {
        System.out.println("Estoy comiendo");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzz");
    }

    @Override
    public void fly() {
        System.out.println("Estoy volando");
    }
}
