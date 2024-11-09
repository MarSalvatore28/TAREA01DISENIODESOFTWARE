/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tarea01diseniolarga;

import java.util.Date;

/**
 *
 * @author marsa
 */
public class Reserva {
    int id;
    Date fechaInicio;
    Date fechaFin;
    String estado;
    double costo;
    Huesped huesped;



     public boolean confirmarReserva() {
        // Código para confirmar reserva
        this.estadoConfirmacion = true;
        procesarPago();
        enviarNotificacion();
        return estadoConfirmacion;
    }
     private void procesarPago() {
        // Código para procesar el pago
        Pago pago = new Pago();
        pago.procesarPago();
        System.out.println("Pago procesado");
    }
    private void enviarNotificacion() {
        ServicioNotificacion servicio = new NotificacionSMS(); // o NotificacionEmail según el tipo de notificación
        servicio.enviarNotificacion();
        System.out.println("Notificación Enviada");
    }

    void cancelarReserva() {
        // Lógica para cancelar reserva
    }

    void modificarReserva() {
        // Lógica para modificar reserva
    }

    void aplicarPoliticaCancelacion() {
        // Lógica para aplicar política de cancelación
    }
    
}
