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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
            System.out.println("Ingrese los grados centígrados actuales: ");
        float conversion = leer.nextFloat();
        float fahrenheit =  Math.round(32 + (9 * conversion / 5));
        
            System.out.println("Los °C que ingresaste, equivalen a " + fahrenheit + " grados Fahrenheit");
    }
    
}
