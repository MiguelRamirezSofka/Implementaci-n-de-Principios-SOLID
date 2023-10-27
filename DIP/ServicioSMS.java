package DIP;

public class ServicioSMS implements ServicioNotificacion {

    @Override
    public String enviar(String mensaje) {
        return mensaje;
    }
}
