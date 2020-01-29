/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ejercicio.pkg9;

import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public class Alumno {
    
    public static int num_asignturas = 5;
    private String nombre;
    private ArrayList<Double> notas;

    public Alumno() {
        nombre ="";
        notas = new ArrayList();
    }

    public Alumno(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public static int getNum_asignturas() {
        return num_asignturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    
    
}
