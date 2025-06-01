package lsp.bueno;

public class DuckBueno extends Bird implements FlyingBird{
    @Override
    public void fly() {
        System.out.println("Estoy volando");
    }
}
