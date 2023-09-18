/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_inicializacion;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_10_INICIALIZACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 0; //Inicialización de la variable
        Scanner teclado = new Scanner (System.in);
        System.out.println(valor);
        
        int precio; //declarar
        precio = 100; //inicializar
        
        double salario = 0, precioMayoreo = 100, iva = 10.5, subtotal = 15, total = 100.0; //declarando 5 variables, TODAS, del tipo doble
        
        //Constantes
        //final te permite asignar el valor solo una vez
        final int conteo;
        conteo = 100;
        System.out.println(conteo);
        
        //usada para cuando queremos tener un valor fijo
        final  double MI_VALOR_PI = 3.1416;
        //Suelen usar nombres de variables en mayusculas y con guión bajo para indicar mas facilmente que se trata de una cosntante
        final String ESCUELA = "Instituto Tecnolólogico de Chihuaua II";
        final int CALIFICACION_PASAR = 70;
        
        /*
        De bloque, para cuando quieres
        poner mucha informacion
        esta es mejor opcion que las dos diagonales
        Tambien sirve para poner cosas que ya no vamos a usar pero queremos guardar para despues
        */
        
        /*
        final String ESCUELA = "Instituto Tecnolólogico de Chihuaua II";
        final int CALIFICACION_PASAR = 70;
        */
        
        int x = 5;//Comentario para una sola línea, todo despues de la doble diagonal se considera un comentario, lo de antes no lo toma como comentario
        
    }
    
}
