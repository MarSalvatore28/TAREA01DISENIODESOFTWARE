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
public class Propiedad {
    private int id;
    private String direccion;
    private TipoPropiedad tipo;
    private ArrayList<Unidad> unidades = new ArrayList<>();
    private ReglasPropiedad reglas;
    private double calificacion;

    void verUnidades() {
        // Lógica para ver unidades
    }

    void agregarUnidad(Unidad unidad) {
        // Lógica para agregar unidad
    }

    void modificarReglas(ReglaPropiedad nuevaRegla) {
        // Lógica para modificar reglas
        this.reglas=nuevaRegla;
    }
    
}
