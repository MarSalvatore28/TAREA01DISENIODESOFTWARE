/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tarea01diseniolarga;

/**
 *
 * @author marsa
 */
public class Unidad {
    private int id;
    private TipoUnidad estado;
    private String nombre;
    private int capacidad;

    public void actualizarEstado(TipoUnidad estado) {
        this.estado = estado; // Lógica para actualizar estado
    }

    void asignarReserva(Reserva reserva) {
        // Lógica para asignar reserva
    }
    
}
