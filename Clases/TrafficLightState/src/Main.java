public class Main {
    public static void main (String[] args) {

        // instances
        TrafficLightContext trafficLight = new TrafficLightContext();

        // Change the state
        trafficLight.changeState();

        // Change the state again
        trafficLight.changeState();

        // Change the state again
        trafficLight.changeState();
    }
}
