package DIP;

public class Notificador {

    private final ServicioNotificacion servicioNotificacion;

    public Notificador(ServicioNotificacion servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }

    public String enviarMensaje(String mensaje){
        return servicioNotificacion.enviar(mensaje);
    }
}
