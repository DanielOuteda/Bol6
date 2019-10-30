/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_4;

/**
 *
 * @author doutedasolla
 */
public class Bol6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personas persona1 = new Personas();
        persona1.Datos();
        Personas persona2 = new Personas();
        persona2.Datos();
        if (persona1.getPeso() > persona2.getPeso()){
            System.out.println(persona1.getNombre()+" pesa mas que "+persona2.getNombre());
            System.out.println("La diferencia de peso es de "+(persona1.getPeso()-persona2.getPeso()));
        }
        else {
            System.out.println(persona1.getNombre()+" pesa menos que "+persona2.getNombre());
            System.out.println("La diferencia de peso es de "+(persona2.getPeso()-persona1.getPeso()));
        }
    }
}
