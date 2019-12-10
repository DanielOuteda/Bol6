/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_5;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Numeros {
    private int valor;
    Scanner teclado=new Scanner(System.in);
    
    public Numeros (){
    }
    public Numeros (int valor){
        this.valor=valor;
    }
    public void setValor (int val){
        valor=val;
    }
    public int getValor (){
        return valor;
    }
    public int darValor (Scanner teclado){
        System.out.println("Escribe un número");
        int val=teclado.nextInt();
        return val;
    }
    public String comprobar (Numeros obxM1, Numeros obxM2, Numeros obxM3){
        if ((obxM1.valor>obxM2.valor)&&(obxM1.valor>obxM3.valor))
            return (obxM1.valor+" es el mayor de los 3");
        else if ((obxM2.valor>obxM1.valor)&&(obxM2.valor>obxM3.valor))
            return (obxM2.valor+" es el mayor de los 3");
        else
            return (obxM3.valor+" es el mayor de los 3");
    }
}
