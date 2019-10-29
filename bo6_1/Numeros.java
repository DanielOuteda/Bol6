/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo6_1;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Numeros {
    Scanner sc = new Scanner(System.in);          
    public void calcular(int numero){
        if (numero>0)
            System.out.println("É positivo");
        else 
            System.out.println("É negativo");
    }
    
    public int pedirInt(){
        System.out.println("Numero: ");
        int num=sc.nextInt();
        return num;
    }    
}
