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
public class Masajista extends SeleccionFutbol implements IntegranteInterfaz{
    private String titulacion;
    private int anhosExperiencia;
    public Masajista(String titulacion,int anhosExperiencia,int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion=titulacion;
        this.anhosExperiencia=anhosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista juega el partido");
    }

    @Override
    public String toString() {
        return "Masajista{"+"nombre "+getNombre() +"\n"+"apellidos "+getApellidos() +"\n"+"id "+getId()+"\n"+"edad "+getEdad()+"\n"+"titulacion " + titulacion + "\n"+"anhosExperiencia " + anhosExperiencia + '}';
    }

   
    
}
