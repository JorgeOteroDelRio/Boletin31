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
public class Entrenador extends SeleccionFutbol implements DeportistaInterfaz,IntegranteInterfaz {
    private int idFederacion;
    public Entrenador(int idFederacion,int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion=idFederacion;
    }
    public void planificarEntrenamiento(){
        System.out.println("El entrenador planifica el entrenamiento");
    }
    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador dirige el Partido");
    }

    @Override
    public String toString() {
                return "Entrenador{"+"nombre "+getNombre() +"\n"+"apellidos "+getApellidos() +"\n"+"id "+getId()+"\n"+"edad "+getEdad()+"\n"+"IdFederacion"+idFederacion +'}';

    }

   
    
}
