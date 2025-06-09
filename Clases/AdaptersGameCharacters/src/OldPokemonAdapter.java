public class OldPokemonAdapter implements NewPokemon{
    private OldPokemon oldPokemon;

    public OldPokemonAdapter(OldPokemon oldPokemon) {
        this.oldPokemon = oldPokemon;
    }

    @Override
    public void specialAttack() {
        oldPokemon.BasicAttack();
    }
}
