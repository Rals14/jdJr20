package dip;

import dip.bueno.LampBuena;
//import dip.bueno.SwichBueno;
import dip.bueno.SwitchLamp;

public class DIPmain {
    public static void main(String[] args) {

        // Creamos una lampara
        //LampMala lampara = new LampMala(); // mala
        LampBuena lampara = new LampBuena(new SwitchLamp());
        lampara.operate("on");
        lampara.operate("off");
    }
}
