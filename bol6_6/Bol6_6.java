/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_6;

/**
 *
 * @author doutedasolla
 */
public class Bol6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto obxPro1 = new Producto();
        obxPro1.setNombre(obxPro1.nombre(obxPro1.teclado));
        obxPro1.setVentas(obxPro1.cantidad(obxPro1.teclado));
        System.out.println("/-/-/-/-/-/-/-/-/-/-");
        System.out.println(obxPro1.volumen(obxPro1.getVentas()));
    }

}
