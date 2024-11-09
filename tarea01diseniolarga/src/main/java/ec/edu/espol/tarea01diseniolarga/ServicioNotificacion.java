/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.tarea01diseniolarga;

/**
 *
 * @author marsa
 */
public interface ServicioNotificacion {
    void enviarNotificacion();
    void cancelarNotificacion();
    
    public class NotificacionSMS implements ServicioNotificacion {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación SMS");
    }

    @Override
    public void cancelarNotificacion() {
        System.out.println("Cancelando notificación SMS");
    }
}

public class NotificacionEmail implements ServicioNotificacion {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación Email");
    }

    @Override
    public void cancelarNotificacion() {
        System.out.println("Cancelando notificación Email");
    }
}
