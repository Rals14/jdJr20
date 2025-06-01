package dip.bueno;

public class LampBuena {
    private SwitchBueno swtichBueno;

    public LampBuena(SwitchBueno switchB) {
        this.swtichBueno = switchB;
    }

    public void operate(String command) {
        if (command.equals("on")) {
            this.swtichBueno.turnOn();
        } else if (command.equals("off")) {
            this.swtichBueno.turnOff();
        }
    }
}
