package srp2;

public class ConexionDB {
    public String conexionDB(String dbName) {
        return String.format("Conectándome a la base de datos %s ...", dbName);
    }
}
