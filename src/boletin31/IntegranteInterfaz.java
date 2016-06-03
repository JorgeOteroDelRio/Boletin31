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
public interface IntegranteInterfaz {
    default void concentrarse(){
        System.out.println("Se concentra desde la interfaz");
    }
    default void viajar(){
        System.out.println("Viajan desde la interfaz");
    }
}
