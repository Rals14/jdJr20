//Concrete state
public class YellowLight implements TrafficLightState{
    @Override
    public void handleState(TrafficLightContext trafficLight) {
        System.out.println("Yellow light, please slow down and wait for the red light");
        trafficLight.setState(new RedLight());
    }
}
