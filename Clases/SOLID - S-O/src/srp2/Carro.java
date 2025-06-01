package srp2;

public class Carro {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public void sendCPUlogsCar () {}

    public String conexionDB(String dbName) {
        return String.format("Conectándome a la base de datos %s ...", dbName);
    }

    public void estacionarCarro() {
        System.out.println("Me estoy estacionando ...");
    }
}
