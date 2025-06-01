package dip.bueno;

public class SwitchLamp extends SwitchBueno {
    @Override
    void turnOn() {
        System.out.println("Enciende la lámpara");
    }

    @Override
    void turnOff() {
        System.out.println("Apaga la lámpara");
    }
}
