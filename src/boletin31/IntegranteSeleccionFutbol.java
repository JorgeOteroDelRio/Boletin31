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

public interface IntegranteSeleccionFutbol {
    public void concentrarse();
    public void viajar();
    public void entrenar();
    public void jugarPartido();
    default void ruedaPrensa(){
        System.out.println("Rueda de prensa");
    }
    default void videoPublicitario(){
        System.out.println("Video publicitario");
    }
}
