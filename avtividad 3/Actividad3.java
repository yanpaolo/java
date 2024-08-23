/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.actividad3;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas
 */
public class Actividad3 {

     public static void main(String[] args) {  
        Scanner yan = new Scanner(System.in);  
 
        System.out.print("Ingrese su nombre: ");  
        String nombre = yan.nextLine();  
        
        System.out.print("Ingrese su apellido: ");  
        String apellido = yan.nextLine();  
        
        System.out.print("Ingrese su edad: ");  
        int edad = yan.nextInt();  
        
        yan.nextLine();   
        System.out.print("Ingrese su sexo (Masculino/Femenino): ");  
        String sexo = yan.nextLine();  
         
        if (edad >= 18) {  
            System.out.println(nombre + " " + apellido + " es mayor de edad.");  
        } else {  
            System.out.println(nombre + " " + apellido + " es menor de edad.");  
        }  
          
        if (sexo.equalsIgnoreCase("Masculino")) {  
            System.out.println(nombre + " es un Hombre.");  
        } else {  
            System.out.println(nombre + " es una Mujer.");  
        }    
    }  
}
