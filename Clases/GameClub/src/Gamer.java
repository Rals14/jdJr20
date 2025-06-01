import java.util.ArrayList;

public class Gamer {
    private String name;
    private ArrayList<Game> games; //agregación

    public Gamer(String name) {
        this.name = name;
        this.games = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    /**
     * Método para prestar libros
     * @param game: Objeto juego que va agregar a la lista de borrowedGames
     */
    public void borrow(Game game) {
        games.add(game);
    }

    /**
     * Muestra los juegos prestados del Gamer
     * @return lista de juegos
     */
    public String borrowedGames() {
        String response = "Lista de juegos prestados por " + name + ":\n";
        for (Game game : games) {
            response += game.viewGame();
        }
        return response;
    }
}
