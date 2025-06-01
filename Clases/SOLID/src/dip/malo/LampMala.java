package dip.malo;

public class LampMala {
    private SwitchMalo swtichMalo;

    public LampMala() {
        this.swtichMalo = new SwitchMalo();
    }

    public void operate(String command) {
        if (command.equals("on")) {
            this.swtichMalo.turnOn();
        } else if (command.equals("off")) {
            this.swtichMalo.turnOff();
        }
    }

}
