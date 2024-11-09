package ec.edu.espol.tarea01diseniolarga;

public class SistemaHomeStay {
    private ServicioDeNotificacion servicioDeNotificacion;

    public SistemaHomeStay() {
        this.servicioDeNotificacion = new ServicioDeNotificacion();
    }

    public void realizarAccion(String tipoAccion) {
        System.out.println("Acción realizada: " + tipoAccion);
        String mensaje = generarMensaje(tipoAccion);
        servicioDeNotificacion.enviarNotificacion(mensaje);
        System.out.println("Notificación enviada.");
    }

    private String generarMensaje(String tipoAccion) {
        return "Mensaje relacionado a: " + tipoAccion;
    }

    public static void main(String[] args) {
        SistemaHomeStay sistema = new SistemaHomeStay();
        sistema.realizarAccion("Confirmar Reserva");
    }
    public void aplicarFiltro() {
        // Código para aplicar filtros de búsqueda
        System.out.println("Filtro aplicado");
    }

    public void mostrarPropiedadesDestacadas() {
        // Código para mostrar propiedades destacadas
        System.out.println("Propiedades destacadas mostradas");
    }

    public void verificarDisponibilidad() {
        // Código para verificar disponibilidad de las propiedades
        System.out.println("Disponibilidad verificada");
    }

}
