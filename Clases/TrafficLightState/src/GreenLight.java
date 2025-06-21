//Concrete state
public class GreenLight implements  TrafficLightState{
    @Override
    public void handleState(TrafficLightContext trafficLight) {
        System.out.println("Green light, you can walk until yellow light");
        trafficLight.setState(new YellowLight());
    }
}
