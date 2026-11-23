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
    
    //Arbol11
    public void arbol11() {
        Nodo raiz = new Nodo(104);

        // Rama izquierda
        raiz.izq = new Nodo(105);

        raiz.izq.izq = new Nodo(107);
        raiz.izq.izq.der = new Nodo(110);

        // Rama derecha
        raiz.der = new Nodo(106);

        raiz.der.izq = new Nodo(108);
        raiz.der.der = new Nodo(109);

        raiz.der.izq.izq = new Nodo(111);
        raiz.der.izq.izq.der = new Nodo(113);

        raiz.der.der.der = new Nodo(112);

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
    //Arbol12
    public void arbol12() {
        Nodo raiz = new Nodo(114);

        // Rama izquierda
        raiz.izq = new Nodo(115);

        raiz.izq.izq = new Nodo(117);
        raiz.izq.der = new Nodo(118);

        raiz.izq.izq.izq = new Nodo(120);
        raiz.izq.der.der = new Nodo(121);
        raiz.izq.der.der.der = new Nodo(123);

        // Rama derecha
        raiz.der = new Nodo(116);

        raiz.der.der = new Nodo(119);
        raiz.der.der.izq = new Nodo(122);

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

    //Arbol13
    public void arbol13() {
        Nodo raiz = new Nodo(124);

        // Rama izquierda
        raiz.izq = new Nodo(125);

        raiz.izq.izq = new Nodo(127);
        raiz.izq.izq.der = new Nodo(130);

        // Rama derecha
        raiz.der = new Nodo(126);

        raiz.der.izq = new Nodo(128);
        raiz.der.der = new Nodo(129);

        raiz.der.izq.izq = new Nodo(131);
        raiz.der.izq.izq.izq = new Nodo(133);

        raiz.der.der.der = new Nodo(132);
        raiz.der.der.der.izq = new Nodo(134);

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

    //Arbol14
    public void arbol14() {
        Nodo raiz = new Nodo(135);

        // Rama izquierda
        raiz.izq = new Nodo(136);

        raiz.izq.izq = new Nodo(138);
        raiz.izq.der = new Nodo(139);

        raiz.izq.izq.izq = new Nodo(141);
        raiz.izq.der.der = new Nodo(142);
        raiz.izq.der.der.der = new Nodo(144);

        // Rama derecha
        raiz.der = new Nodo(137);

        raiz.der.izq = new Nodo(140);
        raiz.der.izq.der = new Nodo(143);
        raiz.der.izq.der.izq = new Nodo(145);

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

    //Arbol15
    public void arbol15() {
        Nodo raiz = new Nodo(146);

        // Rama izquierda
        raiz.izq = new Nodo(147);

        raiz.izq.izq = new Nodo(149);
        raiz.izq.der = new Nodo(150);

        raiz.izq.izq.izq = new Nodo(153);
        raiz.izq.der.der = new Nodo(154);

        raiz.izq.izq.izq.der = new Nodo(157);

        // Rama derecha
        raiz.der = new Nodo(148);

        raiz.der.izq = new Nodo(151);
        raiz.der.der = new Nodo(152);

        raiz.der.izq.izq = new Nodo(155);
        raiz.der.izq.izq.izq = new Nodo(158);
        raiz.der.izq.izq.der = new Nodo(159);

        raiz.der.der.der = new Nodo(156);

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
