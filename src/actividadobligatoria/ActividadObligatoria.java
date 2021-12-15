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
public class ActividadObligatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pers = new Persona();
        Persona per = new Persona("Romina","Valenzuela",35,"Pintar");
       pers.mostrar_datos("Rodigo", "Mendoza", 25, "Criticar peliculas");
    }
    
}
