/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerrecorridoarboles;

import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class TallerRecorridoArboles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Arboles arbol = new Arboles();
        
        int opcion;
        do {
            System.out.println("\n        --- Arbol Binario ---");
            System.out.println("Se mostraran en el siguiente orden:");
            System.out.println("Preorden - Inorden - Postorden - Por niveles");
            
            System.out.println("\n     ELIGE QUE ARBOL BINARIO VER");
            System.out.println("Mostrar Arbol - 1");
            System.out.println("Mostrar Arbol - 2");
            System.out.println("Mostrar Arbol - 3");
            System.out.println("Mostrar Arbol - 4");
            System.out.println("Mostrar Arbol - 5");
            System.out.println("Mostrar Arbol - 6");
            System.out.println("Mostrar Arbol - 7");
            System.out.println("Mostrar Arbol - 8");
            System.out.println("Mostrar Arbol - 9");
            System.out.println("Mostrar Arbol - 10");
            System.out.println("Salir - 11");
            opcion = sc.nextInt();

            switch (opcion) 
            {
                case 1:
                    arbol.arbol1();
                    break;

                case 2:
                    arbol.arbol2();
                    break;

                case 3:
                    arbol.arbol3();
                    break;

                case 4:
                    arbol.arbol4();
                    break;

                case 5:
                    arbol.arbol5();
                    break;

                case 6:
                    arbol.arbol6();
                    break;

                case 7:
                    arbol.arbol7();
                    break;

                case 8:
                    arbol.arbol8();
                    break;

                case 9:
                    arbol.arbol9();
                    break;

                case 10:
                    arbol.arbol10();
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 11);

        sc.close();
    }
}
