/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tarea01diseniolarga;

import java.util.ArrayList;

/**
 *
 * @author marsa
 */
public class Huesped extends Usuario {
    
    ArrayList<Reserva> reservas = new ArrayList<>();
    ArrayList<Pago> pagos = new ArrayList<>();

    String verReservas() {
        return ""; // Lógica para ver reservas
    }

    String reportarIncidente() {
        return ""; // Lógica para reportar incidente
    }

    String calificarPropiedad() {
        return ""; // Lógica para calificar propiedad
    }

    String realizarPago(double monto) {
        return ""; // Lógica para realizar pago
    }

    public void buscarPropiedad() {
        SistemaHomeStay sistema = new SistemaHomeStay();
        sistema.aplicarFiltro();
        sistema.mostrarPropiedadesDestacadas();
        sistema.verificarDisponibilidad();
        System.out.println("Mostrar resultados");
    }

   public void realizarReserva() {
        Reserva reserva = new Reserva();
        if (reserva.confirmarReserva()) {
            System.out.println("Reserva Realizada");
        } else {
            System.out.println("No se pudo realizar la reserva");
        }
    }
    
}
