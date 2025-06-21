// Subscriptor Concreto
public class Alarm implements Subscriber{
    @Override
    public void update(String event) {
        System.out.println("Alarma activada: " + event);
    }
}