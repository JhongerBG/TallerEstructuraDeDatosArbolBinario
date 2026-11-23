/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerrecorridoarboles;

/**
 *
 * @author Johan
 */
public class Arboles {
    Recorrido rc = new Recorrido();
    
    //Arbol 1
    public void arbol1()
    {
        Nodo raiz = new Nodo(1);
        
        //lado izquierdas de la raiz
        raiz.izq = new Nodo(2);
        
        raiz.izq.izq = new Nodo(4);
        raiz.izq.der = new Nodo(5);
        
        raiz.izq.izq.izq = new Nodo(8);
        raiz.izq.izq.der = new Nodo(9);
        
        //lado derecho de la raiz
        raiz.der = new Nodo(3);
        
        raiz.der.izq = new Nodo(6);
        raiz.der.der = new Nodo(7);
        
        raiz.der.izq.der = new Nodo(10);
        
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
    
    //Arbol 2
    public void arbol2() {
        Nodo raiz = new Nodo(11);

        // Rama izquierda
        raiz.izq = new Nodo(12);
        
        raiz.izq.izq = new Nodo(14);
        raiz.izq.der = new Nodo(15);
        
        raiz.izq.izq.izq = new Nodo(17);

        // Rama derecha
        raiz.der = new Nodo(13);
        
        raiz.der.der = new Nodo(16);
        
        raiz.der.der.izq = new Nodo(18);
        raiz.der.der.der = new Nodo(19);
        
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
    
    //Arbol3
    public void arbol3() {
        Nodo raiz = new Nodo(20);

        // Rama izquierda
        raiz.izq = new Nodo(21);
        
        raiz.izq.izq = new Nodo(23);
        raiz.izq.der = new Nodo(24);
        
        raiz.izq.der.izq = new Nodo(27);
        
        // Rama derecha
        raiz.der = new Nodo(22);
        
        raiz.der.izq = new Nodo(25);
        raiz.der.der = new Nodo(26);
        
        raiz.der.der.der = new Nodo(28);
        
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
    
    //Arbol4
    public void arbol4() {
        Nodo raiz = new Nodo(38);

        // Rama izquierda
        raiz.izq = new Nodo(39);
        
        raiz.izq.izq = new Nodo(41);
        raiz.izq.der = new Nodo(42);
        
        raiz.izq.der.der = new Nodo(45);

        // Rama derecha
        raiz.der = new Nodo(40);
        
        raiz.der.izq = new Nodo(43);
        raiz.der.der = new Nodo(44);
        
        raiz.der.der.der = new Nodo(46);
        
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
    
    //Arbol5
    public void arbol5() {
        Nodo raiz = new Nodo(47);

        // Rama izquierda
        raiz.izq = new Nodo(48);
        
        raiz.izq.izq = new Nodo(50);
        
        raiz.izq.izq.izq = new Nodo(53);
        raiz.izq.izq.der = new Nodo(54);

        // Rama derecha
        raiz.der = new Nodo(49);
        
        raiz.der.izq = new Nodo(51);
        raiz.der.der = new Nodo(52);
        
        raiz.der.izq.izq = new Nodo(55);
        
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
    
    //Arbol6
    public void arbol6() {
        Nodo raiz = new Nodo(56);

        // Rama izquierda
        raiz.izq = new Nodo(57);
        
        raiz.izq.izq = new Nodo(59);
        raiz.izq.der = new Nodo(60);
        
        raiz.izq.izq.izq = new Nodo(63);
        raiz.izq.izq.der = new Nodo(64);
        raiz.izq.der.der = new Nodo(65);

        // Rama derecha
        raiz.der = new Nodo(58);
        
        raiz.der.izq = new Nodo(61);
        raiz.der.der = new Nodo(62);
        
        raiz.der.der.der = new Nodo(66);
        
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
    
    //Arbol7
    public void arbol7() {
        Nodo raiz = new Nodo(67);

        // Rama izquierda
        raiz.izq = new Nodo(68);
        
        raiz.izq.izq = new Nodo(70);
        raiz.izq.der = new Nodo(71);
        
        raiz.izq.der.izq = new Nodo(73);
        raiz.izq.der.der = new Nodo(74);

        // Rama derecha
        raiz.der = new Nodo(69);
        
        raiz.der.der = new Nodo(72);
        
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
    
    //Arbol8
    public void arbol8() {
        Nodo raiz = new Nodo(75);

        // Rama izquierda
        raiz.izq = new Nodo(76);
        
        raiz.izq.izq = new Nodo(78);
        
        raiz.izq.izq.izq = new Nodo(80);
        raiz.izq.izq.der = new Nodo(81);

        // Rama derecha
        raiz.der = new Nodo(77);
        
        raiz.der.der = new Nodo(79);
        
        raiz.der.der.izq = new Nodo(82);
        raiz.der.der.der = new Nodo(83);
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
    
    //Arbol9
    public void arbol9() {
        Nodo raiz = new Nodo(84);

        // Rama izquierda
        raiz.izq = new Nodo(85);
        
        raiz.izq.izq = new Nodo(87);
        raiz.izq.der = new Nodo(88);
        
        raiz.izq.der.izq = new Nodo(91);
        raiz.izq.der.der = new Nodo(92);
        

        // Rama derecha
        raiz.der = new Nodo(86);
        
        raiz.der.izq = new Nodo(89);
        raiz.der.der = new Nodo(90);
        
        raiz.der.der.der = new Nodo(93);
        
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
    
    //Arbol10
    public void arbol10() {
        Nodo raiz = new Nodo(94);

        // Rama izquierda
        raiz.izq = new Nodo(95);
        
        raiz.izq.izq = new Nodo(97);
        raiz.izq.der = new Nodo(98);
        
        raiz.izq.der.izq = new Nodo(101);

        // Rama derecha
        raiz.der = new Nodo(96);
        
        raiz.der.izq = new Nodo(99);
        raiz.der.der = new Nodo(100);
        
        raiz.der.izq.der = new Nodo(102);
        raiz.der.der.der = new Nodo(103);
        
        //RECORRIDOS
        rc.preordenRecursivo(raiz);
        System.out.println("Preorden");
        rc.inordenRecursivo(raiz);
        System.out.println("Inorden");
        rc.postordenRecursivo(raiz);
        System.out.println("Postorden");
        rc.BFSRecursivo(raiz);
        System.out.println("BFS");
    }
}
