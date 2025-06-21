public class Main {
    public static void main(String[] args) {
        // Creamos nuestra central de seguridad
        SecurityCentral bankCentralSecurity = new SecurityCentral();

        // Creamos nuestro equipo de monitoreo o suscriptores
        Alarm alarm1 = new Alarm();
        Camera frontalDoorCamera = new Camera();

        // Subscribimos los suscriptores a la central de seguridad
        bankCentralSecurity.subscribe(alarm1);
        bankCentralSecurity.subscribe(frontalDoorCamera);

        // Reportamos un evento
        bankCentralSecurity.TriggerEvent("Intruso detectado en la puerta principal");
        bankCentralSecurity.TriggerEvent("Incendio detectado en el parqueo principal");

        //Desubscribimos la alarma
        bankCentralSecurity.unsubscribe(alarm1);

        // Reportamos otro evento
        bankCentralSecurity.TriggerEvent("Movimiento sospechoso en puerta principal");


    }
}
