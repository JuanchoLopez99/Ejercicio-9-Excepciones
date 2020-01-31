/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ejercicio.pkg9;

import java.util.ArrayList;

/**
 * Clase Alumno, que sirve para almacenar las notas que tiene, hasta un maximo 
 * de 5, ya que estas son las asignaturas que tiene
 * @author sergi
 */
public class Alumno {
    
    
    public static int num_asignturas = 5;
    private String nombre;
    private ArrayList<Double> notas;

    /**
     * Consttructor por defecto
     */
    public Alumno() {
        nombre ="";
        notas = new ArrayList();
    }

    /**
     * Constructor por parametros
     * @param nombre nombre del alumo
     * @param notas array de las notas del alumno
     */
    public Alumno(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    /**
     * getter de las asignaturas
     * @return devuelve el numero de asignaturas, 5
     */
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
    
    public void pedirNotas() throws RangoException {
        
    }
    
}
