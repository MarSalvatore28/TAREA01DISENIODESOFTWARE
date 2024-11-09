/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tarea01diseniolarga;

/**
 *
 * @author marsa
 */
public class Main {
    public static void main(String[] args) {
        SistemaHomeStay sistema = new SistemaHomeStay();
        Huesped huesped = new Huesped(sistema);

        // El huésped confirma el reporte de un incidente con detalles específicos
        huesped.confirmarReporte("Detalles del incidente de prueba.");
    }
}