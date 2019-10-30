/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_4;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Personas {
    private String nombre;
    private int peso;
    
    public Personas(){
    }
    
    public Personas(String nombre, int peso){
        this.nombre=nombre;
        this.peso=peso;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPeso(){
        this.peso=peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void Datos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe o nome: ");
        this.nombre = sc.nextLine();
        System.out.println("Escribe o peso: ");
        this.peso = sc.nextInt();
    }
}
