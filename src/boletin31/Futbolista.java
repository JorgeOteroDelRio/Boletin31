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
public class Futbolista extends SeleccionFutbol implements DeportistaInterfaz,IntegranteInterfaz {
    private int dorsal;
    private String demarcacion;
    public Futbolista(int dorsal,String demarcacion,int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    
    public void entrevista(){
        System.out.println("El jugador acude a la entrevista");
    }
    @Override
    public void concentrarse() {
        System.out.println("El jugador se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El jugador viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El jugador juega el partido");
    }

    @Override
    public String toString() {
                return "Futbolista{"+"nombre "+getNombre() +"\n"+"apellidos "+getApellidos() +"\n"+"id "+getId()+"\n"+"edad "+getEdad()+"\n"+"dorsal " +dorsal+ "\n"+"demarcacion " + demarcacion + '}';

    }
    
}
