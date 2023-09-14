/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;

/**
 *
 * @author Victor Roch
 */
public class Main {

    /** indique cuántos números de teléfono existen contenidos en ese archivo que pertenezcan a Guaymas, Hermosillo, Tijuana y desconocido.
     * @param args the command line arguments
     * Pasos: limpiar, separar, analizar/procesar y contar
     */
    public static void main(String[] args) {
        //Solicitamos la cadena de texto
        System.out.println("Ingrese el texto a evaluar");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        //Limpiamos el texto de todos los caracteres especiales y espacios para dejar exactamente 10 digitos juntos.
        String limpiar = oracion.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
        // Guardamos todos los valores separandolos por comas, es decir, cada numero de telefono le corresponderá una posicion en la aaray
        String [] enunciados = limpiar.split(",");
        //Creamos un contador para cada LADA
        int contadorDesconocido = 0;
        int contadorTijuana = 0;
        int contadorHermosillo = 0;
        int contadorGuaymas = 0;
        for (String r : enunciados){
            //Analizamos cada posicion en la array, entra el primer valor y dependiendo cual cumpla la condicion el contador incrementa en 1 en uno
            if(r.startsWith("664")){
                contadorTijuana++;
            }else if(r.startsWith("662")){
                contadorHermosillo++;
            }else if(r.startsWith("622")){
                contadorGuaymas++;
            }else{
                contadorDesconocido++;
            }
        }
        //Mostramos el conteo final
        System.out.println("Hay "+contadorTijuana+" numeros de Tijuana");
        System.out.println("Hay "+contadorHermosillo+" numeros de Hermosillo");
        System.out.println("Hay "+contadorGuaymas+" numeros de Guaymas");
        System.out.println("Hay "+contadorDesconocido+" numeros desconocidos");
        
        
        
        /*// metodo replace (actividad en clase)//
        String nuevaOracion = oracion.replace("m", "s").replace("M", "s");
        System.out.println(nuevaOracion);
        
        /* //Utilizar el metodo startsWith indica con que inicia una cadena de caracteres
        boolean estaUsada = oracion.startsWith("a")||oracion.startsWith("a");
        
        if (estaUsada){
            System.out.println("Si inica con a");
        }else{
            System.out.println("No inicia con ");
        }
        */
        
        
    }
    
}
