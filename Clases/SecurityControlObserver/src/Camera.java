// Subscriptor concreto
public class Camera implements Subscriber {
    @Override
    public void update(String event) {
        System.out.println("Camara grabando evento: " + event);
    }
}
