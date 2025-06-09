public class Main {
    public static void main(String[] args) {
        NewPokemon charmander = new Charmander();
        NewPokemon garbodor = new Garbodor();
        OldPokemon oldPokemon = new OldPokemon();
        NewPokemon adaptedOldPokemon = new OldPokemonAdapter(oldPokemon);

        charmander.specialAttack();
        garbodor.specialAttack();
        adaptedOldPokemon.specialAttack();
    }
}
