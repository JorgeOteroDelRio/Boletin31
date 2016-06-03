/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

/**
 *
 * @author jorgeotero
 */
public interface DeportistaInterfaz  {
    default void entranar(){
        System.out.println("Entrenar desde la interfaz deportista");
    }
    default void jugarPartido(){
        System.out.println("Jugar partido desde interfaz deportista");
    }
}
