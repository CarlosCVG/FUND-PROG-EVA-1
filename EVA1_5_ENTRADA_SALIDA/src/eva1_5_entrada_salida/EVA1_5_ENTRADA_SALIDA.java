/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_entrada_salida;

/**
 *
 * @author invitado
 */
import java.awt.BorderLayout;
import java.util.Scanner;

public class EVA1_5_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. DECLARACION DE VARIABLES
        Scanner teclado = new Scanner(System.in);
        String apellidos;
        String nombre;
        String control;
        String carrera;
        int semestre;
        // el simbolo ; es el fin de la instrucción en Java
        // Java es sensible a maúsculs y minúsculas
        // Es decir; es diferente System que system
        //2. CAPTURA DE VARIALES
        //3. MOSTRR LOS DATOS CAPTURADOS
        
        System.out.println("Captura tus apellidos:");
            apellidos = teclado.nextLine();
        System.out.println("Captura tu nombre:");
            nombre = teclado.nextLine();
        System.out.println("Captura tu número de control");
            control = teclado.nextLine();
        System.out.println("Captura tu carrera: ");
            carrera = teclado.nextLine();
        System.out.println("Captura tu semestre actual: ");
            semestre = teclado.nextInt();
            
        System.out.println("Tu nombre es: " + nombre + " " + apellidos);
        System.out.println("Número de control: " + control);
        System.out.println("Tu carrera es: " + carrera);
        System.out.println("Tu semestre actual es: " + semestre);
    }
    
}
