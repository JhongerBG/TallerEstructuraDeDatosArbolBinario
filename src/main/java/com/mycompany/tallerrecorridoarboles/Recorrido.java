/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerrecorridoarboles;

/**
 *
 * @author Johan
 */
public class Recorrido {
    //Recorrido Preorden
    public void preordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preordenRecursivo(nodo.izq);
            preordenRecursivo(nodo.der);
        }
    }
    
    // Recorrido Inorden
    public void inordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izq);
            System.out.print(nodo.valor + " ");
            inordenRecursivo(nodo.der);
        }
    }

    // Recorrido Postorden
    public void postordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            postordenRecursivo(nodo.izq);
            postordenRecursivo(nodo.der);
            System.out.print(nodo.valor + " ");
        }
    }
    
    
    private int altura(Nodo raiz) {

        if (raiz == null) {
            return 0;
        }

        int izquierda = altura(raiz.izq);
        int derecha = altura(raiz.der);

        return 1 + Math.max(izquierda, derecha);
    }   
    private void imprimirNivel(Nodo raiz, int nivel) {

        if (raiz == null) {
            return;
        }

        if (nivel == 1) {
            System.out.print(raiz.valor + " ");
            return;
        }

        imprimirNivel(raiz.izq, nivel - 1);
        imprimirNivel(raiz.der, nivel - 1);
    }
    
    //Recorrido Por niveles (BFS)
    public void BFSRecursivo(Nodo raiz) {

        int altura = altura(raiz);

        for (int i = 1; i <= altura; i++) {
            imprimirNivel(raiz, i);
        }
    }
}
