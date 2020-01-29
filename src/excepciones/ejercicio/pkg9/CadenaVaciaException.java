/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ejercicio.pkg9;

/**
 * excepcion que se lanzará cuando al pedir un String se introduce una 
 * cadena vacia
 * 
 * @author sergi
 */
public class CadenaVaciaException extends Exception{

    /**
     * constructor por defecto
     * 
     * @param mensaje 
     */
    public CadenaVaciaException(String mensaje) {
        super(mensaje);
    }
    
}
