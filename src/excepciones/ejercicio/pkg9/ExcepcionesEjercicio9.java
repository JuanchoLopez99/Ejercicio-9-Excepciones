/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ejercicio.pkg9;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author sergi
 */
public class ExcepcionesEjercicio9 {

    /**
     * Metodo que pide un String por teclado, controlando que el String no este
     * vacio
     *
     * @param mensaje Mensaje que se muestra por pantalla para pedir el String
     * @return Devuelve el String
     */
    public static String leerString(String mensaje) {
        String frase = "";
        while (frase.isEmpty()) {
            try {
                frase = ES.leerString(mensaje);
            } catch (CadenaVaciaException error) {
                System.out.println(error.getMessage());
            }
        }
        return frase;
    }

    /**
     * Metodo que pide un char por teclado, controlando que el char no este
     * vacio
     *
     * @param mensaje Mensaje que se muestra por pantalla para pedir el char
     * @return Devuelve un char
     */
    public static char leerChar(String mensaje) {
        char letra = 'a';
        boolean parar = false;
        while (parar == false) {
            try {
                letra = ES.leerChar(mensaje);
                parar = true;
            } catch (CadenaVaciaException error) {
                System.out.println(error.getMessage());
            }
        }
        return letra;
    }

    /**
     * Metodo que pide un entero por teclado, controlando que sea un numero
     *
     * @param mensaje Mensaje que se muestra por pantalla para pedir el int
     * @return devuelve el entero
     */
    public static int leerEntero(String mensaje) {
        int numero = 0;
        boolean parar = false;
        while (parar == false) {
            try {
                numero = ES.leerEntero(mensaje);
                parar = true;
            } catch (InputMismatchException error) {
                System.out.println("No has introducido un número entero");
            }
        }
        return numero;
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
     * metodo que pide por teclado un boolean controlando que sea un boolean
     *
     * @param mensaje Mensaje que se muestra por pantalla para pedir el boolean
     * @return devuelve el boolean
     */
    public static boolean leerBoolean(String mensaje) {
        boolean bool = false;
        boolean parar = false;
        while (parar == false) {
            try {
                bool = ES.leerBoolean(mensaje);
                parar = true;
            } catch (InputMismatchException error) {
                System.out.println("No has introducido un número entero");
            }
        }
        return bool;
    }

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Alumno alu1 = new Alumno();
        alu1.setNombre(leerString("Dime el nombre del alumno"));

        try {
            alu1.pedirNotas();
        } catch (RangoException error) {
            System.out.println(error.getMessage());
        }
        
        ArrayList<Double> nnota = alu1.getNotas();
        nnota.set(leerEntero("Dime que nota quieres cambiar: "), leerDouble("Dime la nueva nota: "));
        alu1.setNotas(nnota);
        
        alu1.imprimirCalificaciones();
        
    }
}
