/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Harold
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
            System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
            System.out.println("La frase ingresada es: " + frase);
            System.out.println("La frase en MAYÚSCULA es: " + frase.toUpperCase());
            System.out.println("La frase en minúscula es: " + frase.toLowerCase());
    }
    
}
