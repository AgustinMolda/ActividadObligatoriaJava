/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadobligatoria;

/**
 *
 * @author Eber
 */
public class Persona {
    private String nombre,apellido,hobbie;
    private int edad;
    
    public Persona(){
    
    }
    public Persona(String nombre,String apellido, int edad, String hobbie){
        mostrar_datos(nombre,apellido,edad,hobbie);
    }
    
    public void mostrar_datos(String nombre, String apellido,int edad,String hobbie){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        
        System.out.println("Nombre: "+nombre + "apellido: "+ apellido + " edad: " +edad+ " hobbie: "+ hobbie);
    }
}
