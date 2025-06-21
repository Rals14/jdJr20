import java.util.ArrayList;
import java.util.List;

public class SecurityCentral {
    // Necisito un lista de suscriptores

    private List<Subscriber> subscribers = new ArrayList<>();

    // Afiliar suscriptores
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    // Metodo para remover suscriptores
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    // Notificar a los suscriptores
    public void notifySubscriber(String event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(event);
        }
    }
    // Reportar evento
    public void TriggerEvent(String event) {
        System.out.println("Central de seguridad: evento reportado: " + event);
        notifySubscriber(event);
    }

}
