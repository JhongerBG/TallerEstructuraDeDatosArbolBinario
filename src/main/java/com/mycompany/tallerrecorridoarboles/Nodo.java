/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerrecorridoarboles;

/**
 *
 * @author Johan
 */
public class Nodo {
    
    int valor;
    
    Nodo izq, der;
    
    public Nodo(int valor)
    {
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }
}
