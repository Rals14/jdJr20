// Context class change the state
public class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new RedLight();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeState() {
        state.handleState(this);
    }
}
