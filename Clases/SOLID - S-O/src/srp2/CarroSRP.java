package srp2;

public class CarroSRP {
    private String marca;
    private String cpuLog;

    public CarroSRP(String marca) {
        this.marca = marca;
    }

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public void sendCPUlogsCar (ConexionDB conexion) {
        String miConexion = conexion.conexionDB("super_app_car");
        //.....
    }

    public void estacionarCarro() {
        System.out.println("Me estoy estacionando ...");
    }
}
