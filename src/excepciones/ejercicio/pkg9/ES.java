/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ejercicio.pkg9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class ES {

    /**
     * Constructor por defecto
     */
    public ES() {
    }

    /** 
     * este metodo nos recibe un mensaje y nos pide un numero entero, en caso
     * de introducir algo que no sea un entero, nos da error y nos vuelve a 
     * pedir el numero.
     * 
     * @param mensajemostrar mensaje que mostrará antes de que escribamos
     * @return nos devuelve un numero entero
     */
    public static int leerEntero(String mensajemostrar) {
        int numero = 0;
        boolean parar = false;
        while (parar == false) {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.print(mensajemostrar);
                numero = teclado.nextInt();
                parar = true;
            } catch (InputMismatchException error) {
                System.out.println("No has introducido un numero entero");
            }
        }
        return numero;
    }

    /** 
     * este metodo nos recibe un mensaje y nos pide un String, en caso de
     * introducir una cadena vacía, nos da error y nos lo vuelve a pedir.
     * 
     * @param mensajemostrar mensaje que mostrará antes de que escribamos
     * @return nos devuelve un String
     */
    public static String leerString(String mensajemostrar) {
        String frase = "";

        while (frase.isEmpty()) {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.print(mensajemostrar);
                frase = teclado.nextLine();
                if (frase.isEmpty()) {
                    throw new CadenaVaciaException("Has introducido una cadena vacía");
                }
            } catch (CadenaVaciaException error) {
                System.out.println(error.getMessage());
            }
        }
        return frase;
    }

    /** 
     * este metodo nos recibe un mensaje y nos pide un String, en caso de
     * introducir algo que no sea true o false, nos da error y nos lo vuelve a 
     * pedir.
     * 
     * @param mensajemostrar mensaje que mostrará antes de que escribamos
     * @return nos devuelve un boolean
     */
    public static boolean leerBoolean(String mensajemostrar) {
        boolean bool = false;
        boolean parar = false;
        while (parar == false) {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.print(mensajemostrar);
                bool = teclado.nextBoolean();
                parar = true;
            } catch (InputMismatchException error) {
                System.out.println("No has introducido un boolean");
            }
        }
        return bool;
    }

    /** 
     * este metodo nos recibe un mensaje y nos pide un numero decimal, en caso
     * de introducir algo que no sea un numero (no importa si es decimal o no, 
     * ya que si no lo es añade .0), nos da error y nos vuelve a pedir el numero.
     * 
     * @param mensajemostrar mensaje que mostrará antes de que escribamos
     * @return nos devuelve un numero entero
     */
    public static double leerDouble(String mensajemostrar) {
        double numero = 0;
        boolean parar = false;
        while (parar == false) {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.print(mensajemostrar);
                numero = teclado.nextDouble();
                parar = true;
            } catch (InputMismatchException error) {
                System.out.println("No has introducido un numero decimal");
            }
        }
        return numero;
    }

    /** 
     * este metodo nos recibe un mensaje y nos pide una letra, en caso de
     * introducir una cadena vacía, nos da error y nos lo vuelve a pedir.
     * 
     * @param mensajemostrar mensaje que mostrará antes de que escribamos
     * @return nos devuelve una letra
     */
    public static char leerChar(String mensajemostrar) {
        char letra = 'a';
        boolean parar = false;
        while (parar == false) {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.print(mensajemostrar);
                letra = teclado.nextLine().charAt(0);
                String comparar = "" + letra;
                parar = true;
            } catch (StringIndexOutOfBoundsException error) {
                System.out.println("No has introducido un carácter");
            }
        }
        return letra;
    }
}
