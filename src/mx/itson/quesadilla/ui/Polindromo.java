/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;
import mx.itson.quesadilla.controlador.Analizador;


/**
 *
 * @author vagui
 */
public class Polindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la frase a analizar: ");
        Scanner sc = new Scanner(System.in);
        String oracion = sc.nextLine();
        
        boolean esPalindrome = Analizador.Polindrome(oracion);
        
        if(esPalindrome){
            System.out.println("Si es palindromo "+oracion);
        }else{
            System.out.println("No es palindromo: "+ oracion);
        }
    }
    
}
