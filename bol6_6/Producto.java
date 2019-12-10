/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6_6;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Producto {

    private String nombre;
    private int ventas;
    Scanner teclado = new Scanner(System.in);

    public Producto() {
    }

    public Producto(String nom, int vent) {
        nombre = nom;
        ventas = vent;
    }

    public void setNombre(String nome) {
        nombre = nome;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public String volumen(int vol) {
        if (vol <= 100) {
            return "Nivel de venta Bajo";
        } else if ((vol > 100) && (vol <= 500)) {
            return "Nivel de venta Medio";
        } else if ((vol > 500) && (vol < 1100)) {
            return "Nivel de venta Alto";
        } else {
            return "Nivek de venta de primera necesidad";
        }
    }

    public String nombre(Scanner teclado) {
        System.out.println("Nombre del Producto:");
        String no = teclado.next();
        return no;
    }

    public int cantidad(Scanner teclado) {
        System.out.println("Cantidad de Productos vendidos: ");
        int cant = teclado.nextInt();
        return cant;
    }
}
