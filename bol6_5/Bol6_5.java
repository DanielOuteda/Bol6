/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_5;

/**
 *
 * @author doutedasolla
 */
public class Bol6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeros obxM1 = new Numeros();
        Numeros obxM2 = new Numeros();
        Numeros obxM3 = new Numeros();
        obxM1.setValor(obxM1.darValor(obxM1.teclado));
        obxM2.setValor(obxM2.darValor(obxM2.teclado));
        obxM3.setValor(obxM3.darValor(obxM3.teclado));
        System.out.println(obxM1.comprobar(obxM1, obxM2, obxM3));
    }
}
