/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

import java.util.ArrayList;

/**
 *
 * @author jorgeotero
 */
public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<SeleccionFutbol> seleccion = new ArrayList();
        SeleccionFutbol masajista = new Masajista("Dipl. Fisioterapia",5,222,"Maria","Gonzalez",23);
        SeleccionFutbol jugador = new Futbolista(1,"Delantero",111,"Ronaldo","Lopez",30);
        SeleccionFutbol entrenador = new Entrenador(123,333,"Adrian","Costa",40);
        
        seleccion.add(jugador);
        seleccion.add(masajista);
        seleccion.add(entrenador);
        
        for(SeleccionFutbol l:seleccion){
            System.out.println(l.toString());
            l.ruedaPrensa();
            l.videoPublicitario();
                    } 
        Futbolista fut = new Futbolista(1,"Delantero",111,"Ronaldo","Lopez",30);
        fut.entranar();
        
    }
    
    
}
