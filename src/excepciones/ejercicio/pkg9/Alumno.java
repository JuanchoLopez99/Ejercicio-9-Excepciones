/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ejercicio.pkg9;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Clase Alumno, que sirve para almacenar las notas que tiene, hasta un maximo
 * de 5, ya que estas son las asignaturas que tiene
 *
 * @author sergi
 */
public class Alumno {

    public static int num_asignaturas = 5;
    private String nombre;
    private ArrayList<Double> notas;

    /**
     * Consttructor por defecto
     */
    public Alumno() {
        nombre = "";
        notas = new ArrayList();
    }

    /**
     * Constructor por parametros
     *
     * @param nombre nombre del alumo
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList();
    }

    /**
     * getter de las asignaturas
     *
     * @return devuelve el numero de asignaturas, 5
     */
    public static int getNum_asignturas() {
        return num_asignaturas;
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

    /**
     * Metodo que pide un decimal porteclado, controlando que sea un numero
     *
     * @param mensaje Mensaje que se muestra por pantalla para pedir el double
     * @return devuelve el decimal
     */
    public static double leerDouble(String mensaje) {
        double numero = 0;
        boolean parar = false;
        while (parar == false) {
            try {
                numero = ES.leerDouble(mensaje);
                parar = true;
            } catch (InputMismatchException error) {
                System.out.println("No has introducido un número entero");
            }
        }
        return numero;
    }

    /**
     *
     * @throws RangoException
     */
    public void pedirNotas() throws RangoException {
        for (int i = 0; i < num_asignaturas; i++) {
            double nota = leerDouble("Dime la nota: ");
            if (nota < 0 || nota > 10) {
                throw new RangoException("Nota introducida no válida");
            }
            notas.add(nota);
        }
    }

    public void modificarNota(int posicion, double nnota) throws RangoException, IndexOutOfBoundsException {
        if (posicion <0 || posicion >= num_asignaturas)
            throw new RangoException("Posición no válida");
        notas.set((posicion - 1), nnota);
    }

    public void imprimirCalificaciones() {
        System.out.println("-----------------"
                + "\nNombre: " + nombre
                + "\nNota 1: " + notas.get(0)
                + "\nNota 2: " + notas.get(1)
                + "\nNota 3: " + notas.get(2)
                + "\nNota 4: " + notas.get(3)
                + "\nNota 5: " + notas.get(4));
    }
}
