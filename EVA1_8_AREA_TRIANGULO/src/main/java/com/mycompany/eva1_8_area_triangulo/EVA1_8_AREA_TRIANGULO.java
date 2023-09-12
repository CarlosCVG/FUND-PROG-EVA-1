/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author Vigoc
 */
public class EVA1_8_AREA_TRIANGULO {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.println("Ingresa la cuanto mide la base del triangulo");
        base = escaner.nextDouble();
        System.out.println("Ingresa la cuanto mide la altura del triangulo");
        altura = escaner.nextDouble();
        area = (base * altura)/2;
        System.out.println("El área del triangulo es: " + area);
        
    }
}
