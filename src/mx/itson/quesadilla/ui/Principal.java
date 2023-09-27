/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;

/**
 *
 * @author vagui
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el texto ");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        
        
        /**
         * METODO TRIM BORRA ESPACIOS DEL INICIO Y AL FINAL
        System.out.println(oracion.trim().toLowerCase());
        */
        
        
        /**
         * metodo de toLowerCase que sirve para poner en minusculas
        String resultado = oracion.toLowerCase();
        System.out.println(resultado);
        System.out.println(resultado.toUpperCase());
        */
        
        /**
         * metodo de toUpperCase que sirve para pasar todo a mayusculas
        System.out.println(oracion.toUpperCase());
        
        */
        /**
         * metodo toCharArray() que sirve para separar caracter por caracter en una array
        char [] arrayChart = oracion.toCharArray();
        for (char a : arrayChart){
            System.out.println(a);
        }
*/
    }
    
}
