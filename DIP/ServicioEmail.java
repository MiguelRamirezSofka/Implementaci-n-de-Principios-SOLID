package DIP;

public class ServicioEmail implements ServicioNotificacion {

    @Override
    public String enviar(String mensaje) {
        return mensaje;
    }
}
