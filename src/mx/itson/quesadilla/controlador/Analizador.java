/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.quesadilla.controlador;


/**
 *
 * @author vagui
 */
public class Analizador {
    
    public static boolean Polindrome (String oracion){
        
        oracion = oracion.toLowerCase().replaceAll(" ", "");
        
        char[] caracteres = oracion.toCharArray();
        
        // Recorremos la frase de adelante hacia atrás
        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            // Si los caracteres no coinciden, la frase no es palíndromo
            if (caracteres[i] != caracteres[j]) {
                return false;
            }
        }
        //la oracion es polindromo
        return true;
    }
    
}
