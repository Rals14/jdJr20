//Concrete state
public class RedLight implements TrafficLightState {
    @Override
    public void handleState(TrafficLightContext trafficLight) {
        System.out.println("Red light, please stop and wait for the green light");
        trafficLight.setState(new GreenLight());

    }
}
