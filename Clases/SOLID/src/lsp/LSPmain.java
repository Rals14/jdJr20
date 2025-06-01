package lsp;

import lsp.bueno.DuckBueno;
import lsp.bueno.OstrichBueno;
import lsp.malo.Duck;
import lsp.malo.Ostrich;

public class LSPmain {
    public static void main(String[] args) {

        // Creemos un pato malo
        //Duck patoReal = new Duck();

        //Cramos un pato que cumpla con LSP
        DuckBueno patoReal = new DuckBueno();
        patoReal.fly();
        patoReal.walk();

        // Ostrich avestruz = new Ostrich(); // Malo, no cumple LSP

        //Creamos un avestruz que cumple con LSP
        OstrichBueno avestruz = new OstrichBueno();
        avestruz.walk();
    }
}
