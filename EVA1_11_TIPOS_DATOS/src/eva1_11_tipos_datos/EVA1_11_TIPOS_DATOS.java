/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_tipos_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_TIPOS_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte calificacion;
        calificacion = 127;
        //calificacion = 200;
        //calificacion = -128;
        //calificacion = -200;
        //calificacion = 127 + 1;
        /*
        Scanner teclado = new Scanner (System.in);
        System.out.println("Sumar valores: ");
        byte captura = teclado.nextByte();
        System.out.println(calificacion + captura);
        */
        
        int valor;
        valor = Integer.MAX_VALUE;
        System.out.println(valor + 1);
        valor = Integer.MIN_VALUE;
        System.out.println(valor);
        
        // SKIP
        
        char caracter = 'A';
        System.out.println(caracter);
        System.out.println(caracter + 0);  
    
    
    
    }
    
}
