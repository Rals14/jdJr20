package lsp.malo;

//Avestruz
public class Ostrich extends BirdMalo{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("No puedo volar.");
    }

}
