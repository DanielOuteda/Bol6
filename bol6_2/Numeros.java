/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_2;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Numeros {
    Scanner sc = new Scanner(System.in);
    public void comparar(){
        System.out.println("Escriba un numero");
        short numero1 = sc.nextShort();
        System.out.println("Escriba otro numero");
        short numero2 = sc.nextShort();
        if (numero1 >= numero2)
            System.out.println("La resta es " + (numero1 - numero2));
        else 
            System.out.println("La suma es " + (numero1 + numero2));
    }
}
