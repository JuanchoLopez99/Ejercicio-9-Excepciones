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
     * este metodo nos recibe un mensaje y nos pide un numero entero, en caso de
     * introducir algo que no sea un entero, nos da error y nos vuelve a pedir
     * el numero.
     *
     * @param mensajemostrar mensaje que mostrará antes de que escribamos
     * @return nos devuelve un numero entero
     */
    public static int leerEntero(String mensajemostrar) throws InputMismatchException {

        Scanner teclado = new Scanner(System.in);
        System.out.print(mensajemostrar);
        int numero = teclado.nextInt();
        return numero;
    }

    /**
     * este metodo nos recibe un mensaje y nos pide un String, en caso de
     * introducir una cadena vacía, nos da error y nos lo vuelve a pedir.
     *
     * @param mensajemostrar mensaje que mostrará antes de que escribamos
     * @return nos devuelve un String
     * @throws excepciones.ejercicio.pkg4.CadenaVaciaException
     */
    public static String leerString(String mensajemostrar) throws CadenaVaciaException {
        System.out.print(mensajemostrar);
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        if (frase.isEmpty()) {
            throw new CadenaVaciaException("Has introducido una cadena vacía");
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
    public static boolean leerBoolean(String mensajemostrar) throws InputMismatchException {
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensajemostrar);
        boolean bool = teclado.nextBoolean();
        return bool;
    }

    /**
     * este metodo nos recibe un mensaje y nos pide un numero decimal, en caso
     * de introducir algo que no sea un numero (no importa si es decimal o no,
     * ya que si no lo es añade .0), nos da error y nos vuelve a pedir el
     * numero.
     *
     * @param mensajemostrar mensaje que mostrará antes de que escribamos
     * @return nos devuelve un numero entero
     */
    public static double leerDouble(String mensajemostrar) throws InputMismatchException {
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensajemostrar);
        double numero = teclado.nextDouble();
        return numero;
    }

    /**
     * este metodo nos recibe un mensaje y nos pide una letra, en caso de
     * introducir una cadena vacía, nos da error y nos lo vuelve a pedir.
     *
     * @param mensajemostrar mensaje que mostrará antes de que escribamos
     * @return nos devuelve una letra
     * @throws excepciones.ejercicio.pkg4.CadenaVaciaException
     */
    public static char leerChar(String mensajemostrar) throws CadenaVaciaException {
        System.out.print(mensajemostrar);
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        if (frase.isEmpty()) {
            throw new CadenaVaciaException("Has introducido una cadena vacía");
        }
        char letra = frase.charAt(0);
        return letra;
    }
}
