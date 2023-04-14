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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un número");
        float numero = leer.nextFloat();
        System.out.println("El número ingresado es: " + Math.round(numero));
        System.out.println("El doble del número " + Math.round(numero) + " es " + Math.round(numero*2));
        System.out.println("El triple del número " + Math.round(numero) + " es " + Math.round(numero*3));
        System.out.println("La raíz cuadrada del número " + Math.round(numero) + " es " + Math.round(Math.sqrt(numero)));  
    }   
}
